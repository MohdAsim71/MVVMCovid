package com.mexcelle.data.repository.country.dataSource

import com.example.kotlincovid19.pojoClass.CountriesDetailsItem
import retrofit2.Response

interface CountryRemoteDataSource {
    suspend fun getCountry(): Response<List<CountriesDetailsItem>>

}