package com.mexcelle.data.domain.repository

import com.mexcelle.data.model.CountriesDetailsItem

interface CountryRepository {
    suspend fun getCountry():List<CountriesDetailsItem>?
    //suspend fun updateArtists():List<CountriesDetails>?
}