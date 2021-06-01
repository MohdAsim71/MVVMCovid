package com.mexcelle.data.repository.country.dataSource

import com.mexcelle.data.model.CountriesDetailsItem


interface CountryLocalDataSource {
    suspend fun getCountryFromDB():List<CountriesDetailsItem>
    suspend fun saveCountryToDB(artists:List<CountriesDetailsItem>)
   // suspend fun clearAll()
}