package com.mexcelle.mvvmcovid.repository.Country.dataSourceImpl

import com.example.kotlincovid19.pojoClass.CountriesDetails
import com.mexcelle.mvvmcovid.api.CovidServices
import com.mexcelle.mvvmcovid.repository.Country.dataSource.CountryRemoteDataSource
import retrofit2.Response

class CounrtyRemoteDataSourceImpl(private val covidServices: CovidServices,
):CountryRemoteDataSource
{
    override suspend fun getCountry(): Response<CountriesDetails> =covidServices.getCountryData()


}


