package com.mexcelle.presentation.di.country

import com.mexcelle.view.country.CountryActivity
import dagger.Subcomponent

@CountryScope
@Subcomponent(modules = [CountryModule::class])
interface CountrySubComponent {
    fun inject(artistActivity: CountryActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():CountrySubComponent
    }

}