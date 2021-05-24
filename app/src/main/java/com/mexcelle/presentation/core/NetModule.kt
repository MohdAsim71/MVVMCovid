package com.mexcelle.presentation.core

import com.mexcelle.mvvmcovid.api.CovidServices
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule() {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://coronavirus-19-api.herokuapp.com/")
            .build()
    }

    @Singleton
    @Provides
    fun provideCOVIDService(retrofit: Retrofit): CovidServices {
        return retrofit.create(CovidServices::class.java)
    }

}