package com.mexcelle.data.repository.hospitals.dataSourceImpl

import com.mexcelle.data.api.CovidServices
import com.mexcelle.data.model.hospitalsPojo.HospitalResponse
import com.mexcelle.data.repository.hospitals.dataSource.HospitalsRemoteDataSource
import retrofit2.Response

class HospitalsRemoteDataSourceImpl(private val covidServices: CovidServices,
):HospitalsRemoteDataSource
{
    override suspend fun getHospitals(): Response<HospitalResponse> =covidServices.getHospitalData()



}


