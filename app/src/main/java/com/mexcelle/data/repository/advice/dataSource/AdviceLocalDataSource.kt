package com.mexcelle.data.repository.advice.dataSource

import com.mexcelle.data.model.advice.NotificationData

interface AdviceLocalDataSource {
    suspend fun getAdviceFromDB():List<NotificationData>
    suspend fun saveAdviceToDB(advice:List<NotificationData>)
   // suspend fun clearAll()
}