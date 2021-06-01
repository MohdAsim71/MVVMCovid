package com.mexcelle.view.hospital

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.mexcelle.data.domain.usecase.HospitalUseCases

class HospitalViewModel (private  val hospitalUseCases: HospitalUseCases): ViewModel() {
    fun getHopsitals() = liveData {
        val countrylist = hospitalUseCases.execute()
        emit(countrylist)
    }
}


