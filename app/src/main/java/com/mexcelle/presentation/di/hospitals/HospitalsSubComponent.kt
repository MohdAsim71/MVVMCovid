package com.mexcelle.presentation.di.hospitals

import com.mexcelle.view.country.CountryActivity
import com.mexcelle.view.hospital.Hospitals
import dagger.Subcomponent

@HospitalsScope
@Subcomponent(modules = [HospitalsModule::class])
interface HospitalsSubComponent {
    fun inject(artistActivity: Hospitals)

    @Subcomponent.Factory
    interface Factory{
        fun create():HospitalsSubComponent
    }

}