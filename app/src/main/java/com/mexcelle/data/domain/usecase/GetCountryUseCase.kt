package com.mexcelle.data.domain.usecase

import com.example.kotlincovid19.pojoClass.CountriesDetailsItem
import com.mexcelle.data.domain.repository.CountryRepository

class GetCountryUseCase(private val countryRepository: CountryRepository) {
    suspend fun execute():List<CountriesDetailsItem>? = countryRepository.getCountry()

}