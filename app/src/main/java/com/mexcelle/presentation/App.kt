package com.mexcelle.presentation

import android.app.Application
import com.anushka.tmdbclient.presentation.di.core.AppModule
import com.mexcelle.presentation.core.AppComponent
import com.mexcelle.presentation.core.DaggerAppComponent
import com.mexcelle.presentation.core.NetModule
import com.mexcelle.presentation.core.RemoteDataModlue
import com.mexcelle.presentation.di.Injector
import com.mexcelle.presentation.di.country.CountrySubComponent

class App : Application(), Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule())
            .remoteDataModlue(RemoteDataModlue())
            .build()
    }

    override fun createCountrySubComponent(): CountrySubComponent {
        return appComponent.countrySubComponent().create()
    }


}