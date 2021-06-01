package com.mexcelle.presentation.di

import com.mexcelle.presentation.di.advice.AdviceSubComponent
import com.mexcelle.presentation.di.contact.ContactSubComponent
import com.mexcelle.presentation.di.country.CountrySubComponent
import com.mexcelle.presentation.di.hospitals.HospitalsSubComponent

interface Injector {
    fun createCountrySubComponent():CountrySubComponent
    fun createHospitalsSubComponent():HospitalsSubComponent
    fun createContactSubComponent():ContactSubComponent
    fun createAdviceSubComponent():AdviceSubComponent
}