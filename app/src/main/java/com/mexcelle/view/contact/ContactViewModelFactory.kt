package com.mexcelle.view.contact

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mexcelle.data.domain.usecase.ContactuseCases
import com.mexcelle.data.domain.usecase.GetCountryUseCase
import com.mexcelle.view.country.CountryViewModel

class ContactViewModelFactory(private val contactuseCases: ContactuseCases) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ContactViewModel(contactuseCases) as T
    }
}


