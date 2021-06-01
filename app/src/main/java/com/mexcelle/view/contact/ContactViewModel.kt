package com.mexcelle.view.contact

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.mexcelle.data.domain.usecase.ContactuseCases
import com.mexcelle.data.domain.usecase.GetCountryUseCase

class ContactViewModel(private val contactuseCases: ContactuseCases): ViewModel() {
    fun getContact() = liveData {
        val contactlist = contactuseCases.execute()
        emit(contactlist)
    }
}


