package com.mexcelle.presentation.di.contact

import com.mexcelle.view.contact.ContactActivity
import dagger.Subcomponent

@ContactScope
@Subcomponent(modules = [ContactModule::class])
interface ContactSubComponent {
    fun inject(artistActivity: ContactActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():ContactSubComponent
    }

}