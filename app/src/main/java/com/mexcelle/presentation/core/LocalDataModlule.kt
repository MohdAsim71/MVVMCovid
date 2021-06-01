package com.mexcelle.presentation.core

import com.mexcelle.data.db.AdviceDao
import com.mexcelle.data.db.ContactDao
import com.mexcelle.data.db.CountryDao
import com.mexcelle.data.db.HospitalDao
import com.mexcelle.data.repository.advice.dataSource.AdviceLocalDataSource
import com.mexcelle.data.repository.advice.dataSourceImpl.AdviceLocalDataSourceImpl
import com.mexcelle.data.repository.contact.dataSource.ContctLocalDataSource
import com.mexcelle.data.repository.contact.dataSourceImpl.ContactLocalDataSourceImpl
import com.mexcelle.data.repository.country.dataSource.CountryLocalDataSource
import com.mexcelle.data.repository.country.dataSourceImpl.CounrtyLocalDataSourceImpl
import com.mexcelle.data.repository.hospitals.dataSource.HospitalsLocalDataSource
import com.mexcelle.data.repository.hospitals.dataSourceImpl.HospitalsLocalDataSourceImpl
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
    @Singleton
    @Provides
    fun provideAdviceLocalDataSource(adviceDao: AdviceDao):AdviceLocalDataSource{
        return AdviceLocalDataSourceImpl(adviceDao)
    }
    @Singleton
    @Provides
    fun provideContactLocalDataSource(contactDao: ContactDao):ContctLocalDataSource{
        return ContactLocalDataSourceImpl(contactDao)
    }
    @Singleton
    @Provides
    fun provideHospitalsLocalDataSource(hospitalDao: HospitalDao):HospitalsLocalDataSource{
        return HospitalsLocalDataSourceImpl(hospitalDao)
    }


}