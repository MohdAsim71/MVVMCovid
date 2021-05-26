package com.mexcelle.presentation.core

import com.mexcelle.data.db.CountryDao
import com.mexcelle.data.repository.country.dataSource.CountryLocalDataSource
import com.mexcelle.data.repository.country.dataSourceImpl.CounrtyLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModlule {
    @Singleton
    @Provides
    fun provideCountryLocalDataSource(countryDao: CountryDao):CountryLocalDataSource{
        return CounrtyLocalDataSourceImpl(countryDao)
    }


}