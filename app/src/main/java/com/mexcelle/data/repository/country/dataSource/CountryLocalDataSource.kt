package com.mexcelle.data.repository.country.dataSource

import com.example.kotlincovid19.pojoClass.CountriesDetailsItem

interface CountryLocalDataSource {
    suspend fun getCountryFromDB():List<CountriesDetailsItem>
    suspend fun saveCountryToDB(artists:List<CountriesDetailsItem>)
   // suspend fun clearAll()
}