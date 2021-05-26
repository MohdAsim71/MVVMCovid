package com.mexcelle.data.domain.repository

import com.example.kotlincovid19.pojoClass.CountriesDetailsItem

interface CountryRepository {
    suspend fun getCountry():List<CountriesDetailsItem>?
    //suspend fun updateArtists():List<CountriesDetails>?
}