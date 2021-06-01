package com.mexcelle.presentation.core

import android.content.Context
import androidx.room.Room
import com.mexcelle.data.db.*
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DataBaseModule {
    @Singleton
    @Provides
    fun provideCountryDataBase(context: Context):CovidDatabase{
        return Room.databaseBuilder(context,CovidDatabase::class.java,"tmdbclient")
            .build()
    }
    @Singleton
    @Provides
    fun provideMovieDao(covidDatabase: CovidDatabase):CountryDao{
        return covidDatabase.CountryDao()
    }

    @Singleton
    @Provides
    fun provideHospitalDao(covidDatabase: CovidDatabase):HospitalDao{
        return covidDatabase.HospitalDao()
    }
    @Singleton
    @Provides
    fun provideContactDao(covidDatabase: CovidDatabase):ContactDao{
        return covidDatabase.ContactDao()
    }
    @Singleton
    @Provides
    fun provideAdviceDao(covidDatabase: CovidDatabase):AdviceDao{
        return covidDatabase.AdviceDao()
    }

}