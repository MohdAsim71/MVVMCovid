package com.mexcelle.presentation.core

import com.mexcelle.mvvmcovid.domain.repository.CountryRepository
import com.mexcelle.mvvmcovid.domain.usecase.GetCountryUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetCountryUseCase(countryRepository: CountryRepository):GetCountryUseCase{
        return GetCountryUseCase(countryRepository)
    }


}