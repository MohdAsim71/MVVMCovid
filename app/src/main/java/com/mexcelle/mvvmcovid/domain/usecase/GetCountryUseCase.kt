package com.mexcelle.mvvmcovid.domain.usecase

import com.example.kotlincovid19.pojoClass.CountriesDetails
import com.mexcelle.mvvmcovid.domain.repository.CountryRepository

class GetCountryUseCase(private val countryRepository: CountryRepository) {
    suspend fun execute():List<CountriesDetails>? = countryRepository.getCountry()

}