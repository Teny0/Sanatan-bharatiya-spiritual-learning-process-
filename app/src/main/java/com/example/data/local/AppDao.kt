package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDao {
    // Child Profile
    @Query("SELECT * FROM child_profile WHERE id = 1")
    fun getProfile(): Flow<ChildProfileEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveProfile(profile: ChildProfileEntity)

    // Daily Activities
    @Query("SELECT * FROM daily_activity_records WHERE dateKey = :dateKey")
    fun getActivitiesForDate(dateKey: String): Flow<List<DailyActivityRecordEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateActivity(record: DailyActivityRecordEntity)

    @Query("UPDATE daily_activity_records SET completed = :completed, completedAt = :timestamp WHERE id = :recordId")
    suspend fun toggleActivityCompletion(recordId: Long, completed: Boolean, timestamp: Long?)

    @Query("DELETE FROM daily_activity_records WHERE dateKey = :dateKey")
    suspend fun clearActivitiesForDate(dateKey: String)

    // Badges
    @Query("SELECT * FROM earned_badges ORDER BY earnedDate DESC")
    fun getEarnedBadges(): Flow<List<EarnedBadgeEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun awardBadge(badge: EarnedBadgeEntity)

    // Weekly Observations
    @Query("SELECT * FROM weekly_observations ORDER BY createdTimestamp DESC")
    fun getWeeklyObservations(): Flow<List<WeeklyObservationEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveWeeklyObservation(observation: WeeklyObservationEntity)

    @Query("SELECT * FROM weekly_observations WHERE weekKey = :weekKey LIMIT 1")
    suspend fun getObservationForWeek(weekKey: String): WeeklyObservationEntity?
}
