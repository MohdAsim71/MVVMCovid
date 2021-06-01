package com.mexcelle.data.repository.hospitals.dataSource

import com.mexcelle.data.model.hospitalsPojo.MedicalCollege

interface HospitalsLocalDataSource {
    suspend fun getHospitalFromDB(): List<MedicalCollege>
    suspend fun savesaveHospitalToDB(medicalCollege: List<MedicalCollege>)
   // suspend fun clearAll()
}