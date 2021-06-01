package com.mexcelle.data.domain.repository

import com.mexcelle.data.model.hospitalsPojo.MedicalCollege

interface HospitalsRepository {
    suspend fun getHospitals(): List<MedicalCollege>?

}