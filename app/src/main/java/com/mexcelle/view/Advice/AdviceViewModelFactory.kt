package com.mexcelle.view.Advice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mexcelle.data.domain.usecase.AdviceUseCases
import com.mexcelle.data.domain.usecase.ContactuseCases
import com.mexcelle.view.contact.ContactViewModel

class AdviceViewModelFactory (private val adviceUseCases: AdviceUseCases):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return AdviceViewModel(adviceUseCases) as T
    }
}


