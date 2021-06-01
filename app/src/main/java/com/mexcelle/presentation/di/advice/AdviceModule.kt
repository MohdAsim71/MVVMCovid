package com.mexcelle.presentation.di.advice

import com.mexcelle.data.domain.usecase.AdviceUseCases
import com.mexcelle.view.Advice.AdviceViewModelFactory
import dagger.Module
import dagger.Provides


@Module
class AdviceModule
{
    @AdviceScope
    @Provides
    fun provideAdviceViewModelFactory(
        adviceUseCases: AdviceUseCases,
    ): AdviceViewModelFactory {
        return AdviceViewModelFactory(
            adviceUseCases
        )
    }
}