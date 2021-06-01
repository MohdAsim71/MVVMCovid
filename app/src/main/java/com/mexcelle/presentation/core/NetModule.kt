package com.mexcelle.presentation.core

import com.mexcelle.data.api.CovidServices
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule() {
    private val BASE_URL = "https://api.rootnet.in/covid19-in/"
    private val BASE_URL2 = "https://coronavirus-19-api.herokuapp.com/"

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }

    @Singleton
    @Provides
    fun provideCOVIDService(retrofit: Retrofit): CovidServices {
        return retrofit.create(CovidServices::class.java)
    }


   /* @Singleton
    @Provides
    fun provideRetrofitAll(): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL2)
                .build()
    }


    @Singleton
    @Provides
    fun provideCOVIDServiceAll(retrofit: Retrofit): CovidServices {
        return retrofit.create(CovidServices::class.java)
    }
*/

}