package com.mexcelle.mvvmcovid.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlincovid19.pojoClass.HospitalDetail
@Dao

interface HospitalDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveHospital(artists : List<HospitalDetail>)

    @Query("SELECT * FROM hospital_details")
    suspend fun getHospital():List<HospitalDetail>
}