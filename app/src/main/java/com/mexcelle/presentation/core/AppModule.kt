package com.anushka.tmdbclient.presentation.di.core

import android.content.Context

import com.mexcelle.presentation.di.country.CountrySubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [CountrySubComponent::class])
class AppModule(private val context: Context) {

 @Singleton
 @Provides
 fun provideApplicationContext():Context{
     return context.applicationContext
 }





}