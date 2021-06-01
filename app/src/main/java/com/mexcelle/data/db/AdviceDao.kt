package com.mexcelle.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mexcelle.data.model.advice.NotificationData

@Dao

interface AdviceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveAdvice(artists : List<NotificationData>)

    @Query("SELECT * FROM advice_details")
    suspend fun getAdvice():List<NotificationData>
}