package com.mexcelle.presentation

import android.app.Application
import com.anushka.tmdbclient.presentation.di.core.AppModule
import com.mexcelle.presentation.core.*
import com.mexcelle.presentation.di.Injector
import com.mexcelle.presentation.di.advice.AdviceSubComponent
import com.mexcelle.presentation.di.contact.ContactSubComponent
import com.mexcelle.presentation.di.country.CountrySubComponent
import com.mexcelle.presentation.di.hospitals.HospitalsSubComponent

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

    override fun createHospitalsSubComponent(): HospitalsSubComponent {
        return appComponent.hospitalsSubComponent().create()
    }

    override fun createContactSubComponent(): ContactSubComponent {
        return appComponent.contactSubComponent().create()
    }

    override fun createAdviceSubComponent(): AdviceSubComponent {
        return appComponent.adviceSubComponent().create()
    }


}