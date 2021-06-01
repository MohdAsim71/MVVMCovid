package com.mexcelle.data.domain.usecase

import com.mexcelle.data.domain.repository.CountryRepository
import com.mexcelle.data.model.CountriesDetailsItem

class GetCountryUseCase(private val countryRepository: CountryRepository) {
    suspend fun execute():List<CountriesDetailsItem>? = countryRepository.getCountry()

}