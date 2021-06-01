package com.mexcelle.data.repository.advice.dataSource

import com.mexcelle.data.model.advice.AdviceResponseData
import retrofit2.Response

interface AdviceRemoteDataSource {
    suspend fun getAdvice(): Response<AdviceResponseData>

}