package com.mexcelle.data.domain.usecase

import com.mexcelle.data.domain.repository.HospitalsRepository
import com.mexcelle.data.model.hospitalsPojo.MedicalCollege

class HospitalUseCases(private  val hospitalsRepository: HospitalsRepository){
    suspend fun execute():List<MedicalCollege>? = hospitalsRepository.getHospitals()

}

