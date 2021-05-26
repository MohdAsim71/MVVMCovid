package com.mexcelle.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlincovid19.pojoClass.StateDetailes
@Dao

interface StateDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveState(artists : List<StateDetailes>)

    @Query("SELECT * FROM state_details")
    suspend fun getState():List<StateDetailes>
}