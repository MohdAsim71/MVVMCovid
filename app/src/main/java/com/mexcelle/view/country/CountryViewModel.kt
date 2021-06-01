package com.mexcelle.view.country

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.mexcelle.data.domain.usecase.GetCountryUseCase

class CountryViewModel(private val getCountryUseCase: GetCountryUseCase
):ViewModel() {
    fun getCountryies() = liveData {
        val countrylist = getCountryUseCase.execute()
        emit(countrylist)
    }
}

