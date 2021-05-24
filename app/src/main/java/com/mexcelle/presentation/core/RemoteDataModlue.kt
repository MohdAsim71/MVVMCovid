package com.mexcelle.presentation.core

import com.mexcelle.mvvmcovid.api.CovidServices
import com.mexcelle.mvvmcovid.repository.Country.dataSource.CountryRemoteDataSource
import com.mexcelle.mvvmcovid.repository.Country.dataSourceImpl.CounrtyRemoteDataSourceImpl
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



}