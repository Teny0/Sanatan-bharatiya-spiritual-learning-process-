package com.example.data.models

enum class HumanPillar(val title: String, val subtitle: String) {
    BODY("Body", "Strength, Balance, Coordination, Flexibility, Habits"),
    MIND("Mind", "Attention, Memory, Reasoning, Creativity, Systems"),
    EMOTIONS("Emotions", "Self-awareness, Empathy, Resilience, Vocabulary"),
    CHARACTER("Character", "Honesty, Courage, Responsibility, Patience"),
    SOCIAL("Social", "Communication, Cooperation, Service, Leadership"),
    TWENTY_FIRST_CENTURY("21st Century", "Adaptability, Systems, Digital Wisdom, Learning")
}

enum class ScriptureOrigin(val displayName: String, val coreGifts: String) {
    VEDAS("Vedas", "Love of learning, nature observation, rhythm, gratitude, curiosity"),
    UPANISHADS("Upanishads", "Self-awareness, deep listening, inner calm, questioning"),
    RAMAYANA("Ramayana", "Integrity, keeping promises, courage, duty, leadership by example"),
    MAHABHARATA("Mahabharata", "Ethical choices, perspective taking, emotional regulation, strategy"),
    BHAGAVAD_GITA("Bhagavad Gita", "Focus on effort, growth mindset, emotional stability, resilience"),
    PURANAS("Puranas", "Story-based moral learning, imagination, wonder, hero journeys")
}

enum class AgeStage(
    val stageId: String,
    val title: String,
    val subtitle: String,
    val levelNumber: Int,
    val levelName: String,
    val minAgeMonths: Int,
    val maxAgeMonths: Int
) {
    STAGE_0_1("0-1", "0–1 Years", "Infant Genesis & Sensory Wonders", 1, "Explorer", 0, 12),
    STAGE_1_2("1-2", "1–2 Years", "Motor Navigation & Early Words", 2, "Seeker", 12, 24),
    STAGE_2_3("2-3", "2–3 Years", "Language Spark & Imaginative Play", 3, "Builder", 24, 36),
    STAGE_3_4("3-4", "3–4 Years", "Social Curiosity & Emotion Naming", 4, "Guardian", 36, 48),
    STAGE_4_5("4-5", "4–5 Years", "Logic, Rhythm & Story Mastery", 5, "Leader", 48, 60),
    STAGE_5_6("5-6", "5–6 Years", "Inquiry, Cooperation & Early Ethics", 6, "Creator", 60, 72),
    STAGE_6_7("6-7", "6–7 Years", "Systems Thinking & Reflective Hero", 7, "Wise Hero", 72, 84);

    companion object {
        fun fromLevel(level: Int): AgeStage =
            entries.firstOrNull { it.levelNumber == level } ?: STAGE_3_4
    }
}

data class ChildActivity(
    val id: String,
    val title: String,
    val pillar: HumanPillar,
    val durationMinutes: Int,
    val timeSlot: String, // "Morning", "Afternoon", "Evening", "Weekly", "Monthly"
    val description: String,
    val gameMechanics: String,
    val parentGuide: String,
    val ancientPrinciple: String,
    val scienceNote: String
)

data class StageDevelopmentPlan(
    val ageStage: AgeStage,
    val brainGoals: List<String>,
    val emotionalGoals: List<String>,
    val physicalGoals: List<String>,
    val socialGoals: List<String>,
    val characterGoals: List<String>,
    val dailyActivities: List<ChildActivity>,
    val weeklyActivities: List<ChildActivity>,
    val monthlyAdventures: List<ChildActivity>,
    val parentCoachingGuidance: String
)

data class LevelMission(
    val id: String,
    val title: String,
    val questType: String, // "Mission", "Challenge", "Quest"
    val description: String,
    val badgeKey: String,
    val requiredPillar: HumanPillar,
    val completed: Boolean = false
)

data class BadgeInfo(
    val key: String,
    val title: String,
    val symbol: String,
    val levelNumber: Int,
    val description: String,
    val traitEarned: String
)

data class SkillTreeNode(
    val id: String,
    val title: String,
    val pillar: HumanPillar,
    val prerequisiteId: String? = null,
    val isUnlocked: Boolean = true,
    val description: String
)

data class MasteryLevel(
    val levelNumber: Int,
    val title: String,
    val ageRange: String,
    val motto: String,
    val missions: List<LevelMission>,
    val badges: List<BadgeInfo>,
    val skillTrees: List<SkillTreeNode>,
    val characterTraits: List<String>
)

data class StoryItem(
    val id: String,
    val dayNumber: Int,
    val title: String,
    val scriptureOrigin: ScriptureOrigin,
    val ageStage: AgeStage,
    val storySummary: String,
    val fullNarration: String,
    val mainLesson: String,
    val emotionalLesson: String,
    val discussionQuestions: List<String>,
    val realLifeChallenge: String,
    val familyActivity: String
)

data class EmotionalGame(
    val id: String,
    val category: String, // "Recognizing", "Naming", "Managing", "Empathy", "Patience", "Delayed Gratification", "Conflict Resolution", "Courage", "Confidence", "Public Speaking"
    val title: String,
    val epicAllegory: String,
    val neuroscienceReasoning: String,
    val howToPlay: String,
    val parentTip: String
)

data class FocusTraining(
    val id: String,
    val title: String,
    val type: String, // "Observation", "Breath", "Listening", "Memory", "Pattern", "Concentration"
    val ageMin: Int,
    val durationMinutes: Int,
    val instructions: String,
    val ancientWisdomRoot: String,
    val modernAttentionBenefit: String
)

data class PhysicalMovement(
    val id: String,
    val animalName: String,
    val movementName: String,
    val targetLiteracy: String, // "Balance", "Coordination", "Strength", "Flexibility", "Rhythm"
    val instructions: String,
    val soundEffectOrChant: String,
    val bodyAwarenessCue: String
)

data class AntiFragilePrinciple(
    val id: String,
    val title: String,
    val challengeType: String, // "Fail Safely", "Recover from Mistakes", "Handle Rejection", "Manage Frustration", "Solve Independently", "Take Responsibility"
    val ancientAnchor: String,
    val scientificInsight: String,
    val realLifeScenario: String,
    val parentScript: String,
    val childActionStep: String
)

data class RoadmapCard(
    val id: String,
    val title: String,
    val pillar: HumanPillar,
    val ageRange: String,
    val ancientPrincipleUsed: String,
    val modernScientificJustification: String,
    val childFriendlyActivity: String,
    val gameMechanics: String,
    val parentInstructions: String,
    val successIndicators: String,
    val futureProgression: String
)
