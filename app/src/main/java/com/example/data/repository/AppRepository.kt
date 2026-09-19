package com.example.data.repository

import com.example.data.api.GeminiService
import com.example.data.local.*
import com.example.data.models.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import java.text.SimpleDateFormat
import java.util.*

class AppRepository(private val db: AppDatabase) {
    private val dao = db.appDao()

    val profileFlow: Flow<ChildProfileEntity?> = dao.getProfile()
    val earnedBadgesFlow: Flow<List<EarnedBadgeEntity>> = dao.getEarnedBadges()
    val weeklyObservationsFlow: Flow<List<WeeklyObservationEntity>> = dao.getWeeklyObservations()

    fun getTodayKey(): String {
        return SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())
    }

    fun getCurrentWeekKey(): String {
        val cal = Calendar.getInstance()
        val year = cal.get(Calendar.YEAR)
        val week = cal.get(Calendar.WEEK_OF_YEAR)
        return "$year-W$week"
    }

    fun getTodayActivities(dateKey: String = getTodayKey()): Flow<List<DailyActivityRecordEntity>> {
        return dao.getActivitiesForDate(dateKey)
    }

    suspend fun initializeDefaultDataIfEmpty() {
        val existingProfile = dao.getProfile().firstOrNull()
        if (existingProfile == null) {
            dao.saveProfile(ChildProfileEntity())
        }

        // Initialize today's routine if empty
        val today = getTodayKey()
        val existingToday = dao.getActivitiesForDate(today).firstOrNull()
        if (existingToday.isNullOrEmpty()) {
            CurriculumRepository.dailyRoutines.forEach { act ->
                dao.insertOrUpdateActivity(
                    DailyActivityRecordEntity(
                        dateKey = today,
                        slot = act.timeSlot.uppercase(Locale.ROOT),
                        activityKey = act.id,
                        title = act.title,
                        completed = false
                    )
                )
            }
        }
    }

    suspend fun updateProfile(name: String, ageMonths: Int, stage: String, level: Int, avatar: String) {
        dao.saveProfile(
            ChildProfileEntity(
                id = 1,
                childName = name,
                ageMonths = ageMonths,
                selectedStage = stage,
                currentLevel = level,
                avatarEmoji = avatar
            )
        )
    }

    suspend fun toggleActivity(recordId: Long, completed: Boolean) {
        val timestamp = if (completed) System.currentTimeMillis() else null
        dao.toggleActivityCompletion(recordId, completed, timestamp)
    }

    suspend fun awardBadge(badge: BadgeInfo) {
        dao.awardBadge(
            EarnedBadgeEntity(
                badgeKey = badge.key,
                title = badge.title,
                symbol = badge.symbol,
                levelNumber = badge.levelNumber,
                traitDescription = badge.traitEarned
            )
        )
    }

    suspend fun saveObservation(
        weekKey: String,
        focus: String,
        kindness: String,
        resilience: String,
        curiosity: String,
        communication: String,
        physical: String,
        celebration: String
    ) {
        dao.saveWeeklyObservation(
            WeeklyObservationEntity(
                weekKey = weekKey,
                focusNote = focus,
                kindnessNote = kindness,
                resilienceNote = resilience,
                curiosityNote = curiosity,
                communicationNote = communication,
                physicalNote = physical,
                celebrationMoment = celebration
            )
        )
    }

    suspend fun askArchitect(prompt: String, stage: String, focus: String): String {
        return GeminiService.consultArchitectWithThinking(prompt, stage, focus).getOrElse {
            "Please check your connection or explore our rich built-in curriculum activities!"
        }
    }

    suspend fun generateStory(day: Int, theme: String, stage: String): String {
        return GeminiService.generateStoryForDay(day, theme, stage).getOrElse {
            "A story of perseverance: Once a little sparrow learned to sing by listening to the river stones..."
        }
    }
}
