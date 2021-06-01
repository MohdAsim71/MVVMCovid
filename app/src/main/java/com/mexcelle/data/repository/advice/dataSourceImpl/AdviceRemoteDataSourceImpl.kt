package com.mexcelle.data.repository.advice.dataSourceImpl

import com.mexcelle.data.api.CovidServices
import com.mexcelle.data.model.advice.AdviceResponseData
import com.mexcelle.data.repository.advice.dataSource.AdviceRemoteDataSource
import retrofit2.Response

class AdviceRemoteDataSourceImpl(private val covidServices: CovidServices,
):AdviceRemoteDataSource
{
    override suspend fun getAdvice(): Response<AdviceResponseData> =covidServices.getAdviceDetails()


}


