package com.mexcelle.presentation.core

import com.mexcelle.data.api.CovidServices
import com.mexcelle.data.repository.country.dataSource.CountryRemoteDataSource
import com.mexcelle.data.repository.country.dataSourceImpl.CounrtyRemoteDataSourceImpl
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