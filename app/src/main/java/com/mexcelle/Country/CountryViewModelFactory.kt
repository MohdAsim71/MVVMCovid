package com.mexcelle.Country

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mexcelle.mvvmcovid.domain.usecase.GetCountryUseCase

class CountryViewModelFactory (
        private val getCountryUseCase: GetCountryUseCase):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CountryViewModel(getCountryUseCase) as T
    }
}

