package com.mexcelle.mvvmcovid.repository.Country.dataSource

import com.example.kotlincovid19.pojoClass.CountriesDetails

interface CountryLocalDataSource {
    suspend fun getCountryFromDB():List<CountriesDetails>
    suspend fun saveCountryToDB(artists:List<CountriesDetails>)
   // suspend fun clearAll()
}