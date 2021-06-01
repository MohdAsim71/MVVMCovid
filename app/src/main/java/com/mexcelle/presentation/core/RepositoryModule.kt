package com.mexcelle.presentation.core
import com.mexcelle.data.domain.repository.AdviceRepository
import com.mexcelle.data.domain.repository.ContactRepository
import com.mexcelle.data.domain.repository.CountryRepository
import com.mexcelle.data.domain.repository.HospitalsRepository
import com.mexcelle.data.repository.advice.AdviceRepositoryImpl
import com.mexcelle.data.repository.advice.dataSource.AdviceLocalDataSource
import com.mexcelle.data.repository.advice.dataSource.AdviceRemoteDataSource
import com.mexcelle.data.repository.contact.ContactRepositoryImpl
import com.mexcelle.data.repository.contact.dataSource.ContactRemoteDataSource
import com.mexcelle.data.repository.contact.dataSource.ContctLocalDataSource
import com.mexcelle.data.repository.country.CountryRepositoryImpl
import com.mexcelle.data.repository.country.dataSource.CountryLocalDataSource
import com.mexcelle.data.repository.country.dataSource.CountryRemoteDataSource
import com.mexcelle.data.repository.hospitals.HospitalsRepositoryImpl
import com.mexcelle.data.repository.hospitals.dataSource.HospitalsLocalDataSource
import com.mexcelle.data.repository.hospitals.dataSource.HospitalsRemoteDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun provideCountryRepository(
        countryRemoteDataSource: CountryRemoteDataSource,
        countryLocalDataSource: CountryLocalDataSource
    ): CountryRepository {

        return CountryRepositoryImpl(
            countryLocalDataSource,
            countryRemoteDataSource,
        )


    }

    @Provides
    @Singleton
    fun provideHospitalsRepository(
       hospitalsRemoteDataSource: HospitalsRemoteDataSource,
        hospitalsLocalDataSource: HospitalsLocalDataSource
    ): HospitalsRepository {

        return HospitalsRepositoryImpl(
            hospitalsLocalDataSource,
            hospitalsRemoteDataSource,
        )


    }

    @Provides
    @Singleton
    fun provideAdviceRepository(
        adviceRemoteDataSource: AdviceRemoteDataSource,
        adviceLocalDataSource: AdviceLocalDataSource
    ): AdviceRepository {

        return AdviceRepositoryImpl(
            adviceLocalDataSource,
            adviceRemoteDataSource,
        )


    }

    @Provides
    @Singleton
    fun provideContactRepository(
        contactRemoteDataSource: ContactRemoteDataSource,
        contctLocalDataSource: ContctLocalDataSource
    ): ContactRepository {

        return ContactRepositoryImpl(
            contctLocalDataSource,
            contactRemoteDataSource,
        )


    }
}