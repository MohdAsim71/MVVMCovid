package com.mexcelle.data.domain.usecase

import com.mexcelle.data.domain.repository.AdviceRepository
import com.mexcelle.data.model.advice.NotificationData

class AdviceUseCases(private val adviceRepository: AdviceRepository) {
    suspend fun execute():List<NotificationData>? = adviceRepository.getAdvices()
}

