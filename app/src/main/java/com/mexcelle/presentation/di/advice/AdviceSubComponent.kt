package com.mexcelle.presentation.di.advice

import com.mexcelle.data.db.AdviceDao
import com.mexcelle.view.Advice.Advisoies
import com.mexcelle.view.hospital.Hospitals
import dagger.Subcomponent

@AdviceScope
@Subcomponent(modules = [AdviceModule::class])
interface AdviceSubComponent {
    fun inject(artistActivity: Advisoies)

    @Subcomponent.Factory
    interface Factory{
        fun create():AdviceSubComponent
    }

}