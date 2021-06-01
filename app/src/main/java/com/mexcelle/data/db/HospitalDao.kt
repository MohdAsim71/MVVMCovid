package com.mexcelle.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mexcelle.data.model.hospitalsPojo.MedicalCollege

@Dao

interface HospitalDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveHospital(medicalCollege: List<MedicalCollege>)

    @Query("SELECT * FROM hospital_details")
    suspend fun getHospital():List<MedicalCollege>

}