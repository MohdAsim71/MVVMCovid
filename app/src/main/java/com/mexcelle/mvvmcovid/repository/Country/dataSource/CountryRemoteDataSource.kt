package com.mexcelle.mvvmcovid.repository.Country.dataSource

import com.example.kotlincovid19.pojoClass.CountriesDetails
import retrofit2.Response

interface CountryRemoteDataSource {
    suspend fun getCountry(): Response<CountriesDetails>

}