package com.mexcelle.presentation.core

import com.anushka.tmdbclient.presentation.di.core.AppModule
import com.mexcelle.presentation.di.country.CountrySubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        DataBaseModule::class,
        UseCaseModule::class,
        RepositoryModule::class,
        LocalDataModlule::class,
        RemoteDataModlue::class
    ]
)
interface AppComponent {

    fun countrySubComponent(): CountrySubComponent.Factory
}