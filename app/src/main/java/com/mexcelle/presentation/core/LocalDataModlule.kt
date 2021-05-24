package com.mexcelle.presentation.core

import com.mexcelle.mvvmcovid.db.CountryDao
import com.mexcelle.mvvmcovid.repository.Country.dataSource.CountryLocalDataSource
import com.mexcelle.mvvmcovid.repository.Country.dataSourceImpl.CounrtyLocalDataSourceImpl
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