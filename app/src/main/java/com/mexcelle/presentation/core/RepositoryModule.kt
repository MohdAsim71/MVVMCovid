package com.mexcelle.presentation.core
import com.mexcelle.data.domain.repository.CountryRepository
import com.mexcelle.data.repository.country.CountryRepositoryImpl
import com.mexcelle.data.repository.country.dataSource.CountryLocalDataSource
import com.mexcelle.data.repository.country.dataSource.CountryRemoteDataSource
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