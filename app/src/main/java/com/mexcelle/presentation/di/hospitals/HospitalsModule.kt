package com.mexcelle.presentation.di.hospitals

import com.mexcelle.view.country.CountryViewModelFactory
import com.mexcelle.data.domain.usecase.GetCountryUseCase
import com.mexcelle.data.domain.usecase.HospitalUseCases
import com.mexcelle.view.hospital.HospitalViewModelFactory
import dagger.Module
import dagger.Provides


@Module
class HospitalsModule
{
    @HospitalsScope
    @Provides
    fun provideHospitalsViewModelFactory(
        hospitalUseCases: HospitalUseCases,
    ): HospitalViewModelFactory {
        return HospitalViewModelFactory(
            hospitalUseCases
        )
    }
}