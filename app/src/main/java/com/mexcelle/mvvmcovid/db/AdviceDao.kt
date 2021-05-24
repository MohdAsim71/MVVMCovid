package com.mexcelle.mvvmcovid.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlincovid19.pojoClass.AdvisorieDetail
import com.example.kotlincovid19.pojoClass.StateDetailes
@Dao

interface AdviceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveAdvice(artists : List<AdvisorieDetail>)

    @Query("SELECT * FROM advice_details")
    suspend fun getAdvice():List<AdvisorieDetail>
}