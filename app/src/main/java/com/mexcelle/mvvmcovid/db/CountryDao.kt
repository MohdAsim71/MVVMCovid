package com.mexcelle.mvvmcovid.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlincovid19.pojoClass.CountriesDetails

@Dao
interface CountryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveCountyries(artists : List<CountriesDetails>)

    @Query("SELECT * FROM country_details")
    suspend fun getArtists():List<CountriesDetails>
}