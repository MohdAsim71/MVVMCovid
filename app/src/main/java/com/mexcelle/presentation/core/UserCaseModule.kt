package com.mexcelle.presentation.core

import com.mexcelle.data.domain.repository.AdviceRepository
import com.mexcelle.data.domain.repository.ContactRepository
import com.mexcelle.data.domain.repository.CountryRepository
import com.mexcelle.data.domain.repository.HospitalsRepository
import com.mexcelle.data.domain.usecase.AdviceUseCases
import com.mexcelle.data.domain.usecase.ContactuseCases
import com.mexcelle.data.domain.usecase.GetCountryUseCase
import com.mexcelle.data.domain.usecase.HospitalUseCases
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetCountryUseCase(countryRepository: CountryRepository):GetCountryUseCase{
        return GetCountryUseCase(countryRepository)
    }

    @Provides
    fun provideGetHospitalsUseCase(hospitalsRepository: HospitalsRepository):HospitalUseCases{
        return HospitalUseCases(hospitalsRepository)
    }
    @Provides
    fun provideGetContactUseCase(contactRepository: ContactRepository):ContactuseCases{
        return ContactuseCases(contactRepository)
    }
    @Provides
    fun provideGetAdviceUseCase(adviceRepository: AdviceRepository):AdviceUseCases{
        return AdviceUseCases(adviceRepository)
    }
}