package com.mexcelle.mvvmcovid.repository.Country.dataSourceImpl

import com.example.kotlincovid19.pojoClass.CountriesDetails
import com.mexcelle.mvvmcovid.db.CountryDao
import com.mexcelle.mvvmcovid.repository.Country.dataSource.CountryLocalDataSource

class CounrtyLocalDataSourceImpl(private val countryDao:CountryDao):CountryLocalDataSource
{
    override suspend fun getCountryFromDB(): List<CountriesDetails> {
        return countryDao.getArtists()
    }

    override suspend fun saveCountryToDB(artists: List<CountriesDetails>) {
      countryDao.saveCountyries(artists)
    }


   /* override suspend fun clearAll() {

    }*/

}