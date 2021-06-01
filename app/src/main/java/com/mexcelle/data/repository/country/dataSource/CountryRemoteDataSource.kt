package com.mexcelle.data.repository.country.dataSource

import com.mexcelle.data.model.CountriesDetailsItem
import retrofit2.Response

interface CountryRemoteDataSource {
    suspend fun getCountry(): Response<List<CountriesDetailsItem>>

}