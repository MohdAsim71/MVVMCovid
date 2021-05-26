package com.mexcelle.presentation.di.country

import com.mexcelle.countryActivity.CountryViewModelFactory
import com.mexcelle.data.domain.usecase.GetCountryUseCase
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