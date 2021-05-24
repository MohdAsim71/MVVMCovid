package com.mexcelle.mvvmcovid.domain.repository

import com.example.kotlincovid19.pojoClass.CountriesDetails

interface CountryRepository {
    suspend fun getCountry():List<CountriesDetails>?
    //suspend fun updateArtists():List<CountriesDetails>?
}