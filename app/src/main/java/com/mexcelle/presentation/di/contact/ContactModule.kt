package com.mexcelle.presentation.di.contact

import com.mexcelle.data.domain.usecase.ContactuseCases
import com.mexcelle.data.domain.usecase.HospitalUseCases
import com.mexcelle.view.contact.ContactViewModelFactory
import com.mexcelle.view.hospital.HospitalViewModelFactory
import dagger.Module
import dagger.Provides


@Module
class ContactModule
{
    @ContactScope
    @Provides
    fun provideContactViewModelFactory(
        contactuseCases: ContactuseCases,
    ): ContactViewModelFactory {
        return ContactViewModelFactory(
            contactuseCases
        )
    }
}