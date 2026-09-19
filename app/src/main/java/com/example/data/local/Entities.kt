package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "child_profile")
data class ChildProfileEntity(
    @PrimaryKey val id: Int = 1,
    val childName: String = "Arya",
    val ageMonths: Int = 42, // Default ~3.5 years (Stage 3-4 / Guardian)
    val selectedStage: String = "3-4",
    val currentLevel: Int = 4,
    val avatarEmoji: String = "🌱"
)

@Entity(tableName = "daily_activity_records")
data class DailyActivityRecordEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val dateKey: String,
    val slot: String, // "MORNING", "AFTERNOON", "EVENING"
    val activityKey: String,
    val title: String,
    val completed: Boolean = false,
    val completedAt: Long? = null,
    val parentNote: String? = null
)

@Entity(tableName = "earned_badges")
data class EarnedBadgeEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val badgeKey: String,
    val title: String,
    val symbol: String,
    val levelNumber: Int,
    val earnedDate: Long = System.currentTimeMillis(),
    val traitDescription: String
)

@Entity(tableName = "weekly_observations")
data class WeeklyObservationEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val weekKey: String,
    val focusNote: String = "",
    val kindnessNote: String = "",
    val resilienceNote: String = "",
    val curiosityNote: String = "",
    val communicationNote: String = "",
    val physicalNote: String = "",
    val celebrationMoment: String = "",
    val createdTimestamp: Long = System.currentTimeMillis()
)
