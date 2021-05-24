package com.mexcelle.presentation.di.country

import com.mexcelle.Country.CountryViewModelFactory
import com.mexcelle.mvvmcovid.domain.usecase.GetCountryUseCase
import dagger.Module
import dagger.Provides


@Module
class CountryModule
{
    @CountryScope
    @Provides
    fun provideCountryViewModelFactory(
        getCountryUseCase: GetCountryUseCase,
    ): CountryViewModelFactory {
        return CountryViewModelFactory(
            getCountryUseCase
        )
    }
}