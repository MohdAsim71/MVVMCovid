package com.mexcelle.data.repository.advice

import android.util.Log
import android.view.View
import com.mexcelle.data.domain.repository.AdviceRepository
import com.mexcelle.data.model.advice.NotificationData
import com.mexcelle.data.repository.advice.dataSource.AdviceLocalDataSource
import com.mexcelle.data.repository.advice.dataSource.AdviceRemoteDataSource
import com.mexcelle.view.Advice.Advisoies
import java.lang.Exception

class AdviceRepositoryImpl(
    private val adviceLocalDataSource: AdviceLocalDataSource,
    private val adviceRemoteDataSource: AdviceRemoteDataSource
):AdviceRepository
{
    override suspend fun getAdvices(): List<NotificationData>? {
    return getAdviceFromAPI()
    }

       suspend fun getAdviceFromAPI(): List<NotificationData> {
         var advice: List<NotificationData> =  ArrayList<NotificationData>()
        Log.e("response","running")

        try {
            val response = adviceRemoteDataSource.getAdvice()
            val body = response.body()
            Log.e("response1", body.toString())
            if(body!=null){
                advice=body.data.notifications
                Advisoies.shimmerFrameLayout!!.stopShimmerAnimation()
                Advisoies.shimmerFrameLayout!!.visibility = View.GONE
                Log.e("response list",advice.toString())

            }
        } catch (exception: Exception) {
            Log.e("MyTag", exception.message.toString())
        }
        return advice
    }

    suspend fun AdviceFromDB():List<NotificationData>{
         var adviceList: List<NotificationData> =  ArrayList<NotificationData>()
        try {
            adviceList = adviceLocalDataSource.getAdviceFromDB()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(adviceList.size>0){
            return adviceList
        }else{
            adviceList=getAdviceFromAPI()
            adviceLocalDataSource.saveAdviceToDB(adviceList)
        }

        return adviceList
    }



}








