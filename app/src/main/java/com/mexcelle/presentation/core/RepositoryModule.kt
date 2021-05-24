package com.mexcelle.presentation.core
import com.mexcelle.mvvmcovid.domain.repository.CountryRepository
import com.mexcelle.mvvmcovid.repository.Country.CountryRepositoryImpl
import com.mexcelle.mvvmcovid.repository.Country.dataSource.CountryLocalDataSource
import com.mexcelle.mvvmcovid.repository.Country.dataSource.CountryRemoteDataSource
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
}