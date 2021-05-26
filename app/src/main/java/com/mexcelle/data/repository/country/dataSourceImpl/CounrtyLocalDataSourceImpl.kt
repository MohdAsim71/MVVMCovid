package com.mexcelle.data.repository.country.dataSourceImpl

import com.example.kotlincovid19.pojoClass.CountriesDetailsItem
import com.mexcelle.data.db.CountryDao
import com.mexcelle.data.repository.country.dataSource.CountryLocalDataSource

class CounrtyLocalDataSourceImpl(private val countryDao:CountryDao):CountryLocalDataSource
{
    override suspend fun getCountryFromDB(): List<CountriesDetailsItem> {
        return countryDao.getArtists()
    }

    override suspend fun saveCountryToDB(artists: List<CountriesDetailsItem>) {
      countryDao.saveCountyries(artists)
    }


   /* override suspend fun clearAll() {

    }*/

}