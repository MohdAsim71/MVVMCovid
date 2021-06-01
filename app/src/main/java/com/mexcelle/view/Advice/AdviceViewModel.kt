package com.mexcelle.view.Advice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.mexcelle.data.domain.usecase.AdviceUseCases

class AdviceViewModel(private val adviceUseCases: AdviceUseCases): ViewModel() {
    fun getAdvice() = liveData {
        val advicelist = adviceUseCases.execute()
        emit(advicelist)
    }
}