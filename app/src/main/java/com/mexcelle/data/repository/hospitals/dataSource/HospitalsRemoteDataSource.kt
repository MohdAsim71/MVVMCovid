package com.mexcelle.data.repository.hospitals.dataSource

import com.mexcelle.data.model.hospitalsPojo.HospitalResponse
import retrofit2.Response

interface HospitalsRemoteDataSource {
    suspend fun getHospitals(): Response<HospitalResponse>

}