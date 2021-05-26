package com.mexcelle.data.repository.country.dataSourceImpl

import com.example.kotlincovid19.pojoClass.CountriesDetailsItem
import com.mexcelle.data.api.CovidServices
import com.mexcelle.data.repository.country.dataSource.CountryRemoteDataSource
import retrofit2.Response

class CounrtyRemoteDataSourceImpl(private val covidServices: CovidServices,
):CountryRemoteDataSource
{
    override suspend fun getCountry(): Response<List<CountriesDetailsItem>> =covidServices.getCountryData()


}


