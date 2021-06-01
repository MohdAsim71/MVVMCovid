package com.mexcelle.view.hospital

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mexcelle.data.domain.usecase.HospitalUseCases

class HospitalViewModelFactory(
    private val hospitalUseCases: HospitalUseCases):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HospitalViewModel(hospitalUseCases) as T
    }
}


