package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.local.AppDatabase
import com.example.data.local.ChildProfileEntity
import com.example.data.local.DailyActivityRecordEntity
import com.example.data.local.EarnedBadgeEntity
import com.example.data.local.WeeklyObservationEntity
import com.example.data.models.*
import com.example.data.repository.AppRepository
import com.example.data.repository.CurriculumRepository
import com.example.ui.audio.TtsManager
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

data class MainUiState(
    val profile: ChildProfileEntity = ChildProfileEntity(),
    val todayActivities: List<DailyActivityRecordEntity> = emptyList(),
    val earnedBadges: List<EarnedBadgeEntity> = emptyList(),
    val weeklyObservations: List<WeeklyObservationEntity> = emptyList(),
    val selectedAgeStage: AgeStage = AgeStage.STAGE_3_4,
    val selectedStory: StoryItem? = CurriculumRepository.coreStories.firstOrNull(),
    val customStoryText: String? = null,
    val isStoryLoading: Boolean = false,
    val isArchitectThinking: Boolean = false,
    val architectResponses: List<Pair<String, String>> = emptyList(),
    val isAudioPlaying: Boolean = false,
    val currentFilterPillar: HumanPillar? = null,
    val activeDailySlot: String = "MORNING"
)

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val database = AppDatabase.getDatabase(application)
    val repository = AppRepository(database)
    val ttsManager = TtsManager(application)

    private val _uiState = MutableStateFlow(MainUiState())
    val uiState: StateFlow<MainUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            repository.initializeDefaultDataIfEmpty()
        }

        // Collect profile
        viewModelScope.launch {
            repository.profileFlow.collect { prof ->
                if (prof != null) {
                    val stage = AgeStage.entries.firstOrNull { it.stageId == prof.selectedStage }
                        ?: AgeStage.fromLevel(prof.currentLevel)
                    _uiState.update { it.copy(profile = prof, selectedAgeStage = stage) }
                }
            }
        }

        // Collect today activities
        viewModelScope.launch {
            repository.getTodayActivities().collect { list ->
                _uiState.update { it.copy(todayActivities = list) }
            }
        }

        // Collect badges
        viewModelScope.launch {
            repository.earnedBadgesFlow.collect { badges ->
                _uiState.update { it.copy(earnedBadges = badges) }
            }
        }

        // Collect observations
        viewModelScope.launch {
            repository.weeklyObservationsFlow.collect { obsList ->
                _uiState.update { it.copy(weeklyObservations = obsList) }
            }
        }

        // Collect TTS state
        viewModelScope.launch {
            ttsManager.isSpeaking.collect { speaking ->
                _uiState.update { it.copy(isAudioPlaying = speaking) }
            }
        }
    }

    fun selectAgeStage(stage: AgeStage) {
        _uiState.update { it.copy(selectedAgeStage = stage) }
    }

    fun selectStory(story: StoryItem) {
        stopAudio()
        _uiState.update { it.copy(selectedStory = story, customStoryText = null) }
    }

    fun filterByPillar(pillar: HumanPillar?) {
        _uiState.update { it.copy(currentFilterPillar = pillar) }
    }

    fun setDailySlot(slot: String) {
        _uiState.update { it.copy(activeDailySlot = slot) }
    }

    fun toggleActivityCompletion(recordId: Long, currentCompleted: Boolean) {
        viewModelScope.launch {
            repository.toggleActivity(recordId, !currentCompleted)
            // If completed, check if badge should be awarded
            if (!currentCompleted) {
                checkAndAwardMilestoneBadge()
            }
        }
    }

    private suspend fun checkAndAwardMilestoneBadge() {
        val completedCount = _uiState.value.todayActivities.count { it.completed }
        if (completedCount >= 2) {
            val badge = CurriculumRepository.masteryLevels
                .firstOrNull { it.levelNumber == _uiState.value.profile.currentLevel }
                ?.badges?.firstOrNull()
            if (badge != null) {
                repository.awardBadge(badge)
            }
        }
    }

    fun updateChildProfile(name: String, ageMonths: Int, stageId: String, level: Int, avatar: String) {
        viewModelScope.launch {
            repository.updateProfile(name, ageMonths, stageId, level, avatar)
        }
    }

    fun saveWeeklyObservation(
        focus: String,
        kindness: String,
        resilience: String,
        curiosity: String,
        communication: String,
        physical: String,
        celebration: String
    ) {
        viewModelScope.launch {
            val weekKey = repository.getCurrentWeekKey()
            repository.saveObservation(
                weekKey = weekKey,
                focus = focus,
                kindness = kindness,
                resilience = resilience,
                curiosity = curiosity,
                communication = communication,
                physical = physical,
                celebration = celebration
            )
        }
    }

    fun askArchitect(query: String) {
        if (query.isBlank()) return
        val currentStage = _uiState.value.selectedAgeStage.title
        val focus = _uiState.value.currentFilterPillar?.title ?: "Holistic Child Development"

        _uiState.update {
            it.copy(
                isArchitectThinking = true,
                architectResponses = it.architectResponses + (query to "Architect is contemplating child psychology & ancient universal principles...")
            )
        }

        viewModelScope.launch {
            val response = repository.askArchitect(query, currentStage, focus)
            _uiState.update { state ->
                val updated = state.architectResponses.dropLast(1) + (query to response)
                state.copy(isArchitectThinking = false, architectResponses = updated)
            }
        }
    }

    fun generateCustomStory(day: Int, theme: String) {
        val stage = _uiState.value.selectedAgeStage.title
        _uiState.update { it.copy(isStoryLoading = true) }
        viewModelScope.launch {
            val generated = repository.generateStory(day, theme, stage)
            _uiState.update { it.copy(isStoryLoading = false, customStoryText = generated) }
        }
    }

    fun readCurrentStoryAloud() {
        val story = _uiState.value.selectedStory
        val custom = _uiState.value.customStoryText
        val textToRead = when {
            custom != null -> custom
            story != null -> "${story.title}. A story inspired by the ${story.scriptureOrigin.displayName}. ${story.fullNarration} ... The main lesson is: ${story.mainLesson}. Let's try this challenge: ${story.realLifeChallenge}"
            else -> "Welcome to BalVeda. Sit comfortably and let's explore learning together."
        }
        ttsManager.speak(textToRead)
    }

    fun stopAudio() {
        ttsManager.stop()
    }

    override fun onCleared() {
        super.onCleared()
        ttsManager.shutdown()
    }
}
