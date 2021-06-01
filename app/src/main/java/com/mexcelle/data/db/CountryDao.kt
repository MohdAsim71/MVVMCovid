package com.mexcelle.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mexcelle.data.model.CountriesDetailsItem

@Dao
interface CountryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveCountyries(artists : List<CountriesDetailsItem>)

    @Query("SELECT * FROM country_details")
    suspend fun getArtists():List<CountriesDetailsItem>
}