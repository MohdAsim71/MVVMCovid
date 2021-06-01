package com.mexcelle.presentation.core

import com.mexcelle.data.api.CovidServices
import com.mexcelle.data.repository.advice.dataSource.AdviceRemoteDataSource
import com.mexcelle.data.repository.advice.dataSourceImpl.AdviceRemoteDataSourceImpl
import com.mexcelle.data.repository.contact.dataSource.ContactRemoteDataSource
import com.mexcelle.data.repository.contact.dataSourceImpl.ContactRemoteDataSourceImpl
import com.mexcelle.data.repository.country.dataSource.CountryRemoteDataSource
import com.mexcelle.data.repository.country.dataSourceImpl.CounrtyRemoteDataSourceImpl
import com.mexcelle.data.repository.hospitals.dataSource.HospitalsRemoteDataSource
import com.mexcelle.data.repository.hospitals.dataSourceImpl.HospitalsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModlue {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(covidServices: CovidServices): CountryRemoteDataSource {
        return CounrtyRemoteDataSourceImpl(
            covidServices
        )
    }

    @Singleton
    @Provides
    fun provideContactRemoteDataSource(covidServices: CovidServices): ContactRemoteDataSource {
        return ContactRemoteDataSourceImpl(
            covidServices
        )
    }

    @Singleton
    @Provides
    fun providAdviceRemoteDataSource(covidServices: CovidServices): AdviceRemoteDataSource {
        return AdviceRemoteDataSourceImpl(
            covidServices
        )
    }

    @Singleton
    @Provides
    fun provideHospitalsRemoteDataSource(covidServices: CovidServices): HospitalsRemoteDataSource {
        return HospitalsRemoteDataSourceImpl(
            covidServices
        )
    }



}