package com.mexcelle.presentation.di

import com.mexcelle.presentation.di.country.CountrySubComponent

interface Injector {
    fun createCountrySubComponent():CountrySubComponent
}