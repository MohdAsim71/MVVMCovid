package com.mexcelle.data.domain.repository

import com.mexcelle.data.model.advice.NotificationData

interface AdviceRepository {
    suspend fun getAdvices():List<NotificationData>?

}