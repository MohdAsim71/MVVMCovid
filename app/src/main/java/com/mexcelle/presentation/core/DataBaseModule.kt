package com.mexcelle.presentation.core

import android.content.Context
import androidx.room.Room
import com.mexcelle.data.db.CountryDao
import com.mexcelle.data.db.CovidDatabase
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


}