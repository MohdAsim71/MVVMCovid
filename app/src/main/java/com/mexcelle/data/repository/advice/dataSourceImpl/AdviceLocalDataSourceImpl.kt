package com.mexcelle.data.repository.advice.dataSourceImpl

import com.mexcelle.data.db.AdviceDao
import com.mexcelle.data.model.advice.NotificationData
import com.mexcelle.data.repository.advice.dataSource.AdviceLocalDataSource

class AdviceLocalDataSourceImpl(private val adviceDao: AdviceDao):AdviceLocalDataSource
{


    override suspend fun getAdviceFromDB(): List<NotificationData> {
return adviceDao.getAdvice()

    }

    override suspend fun saveAdviceToDB(advice: List<NotificationData>) {
return adviceDao.saveAdvice(advice)    }


    /* override suspend fun clearAll() {

     }*/

}