package com.mexcelle.data.repository.contact

import android.util.Log
import android.view.View
import com.mexcelle.data.domain.repository.ContactRepository
import com.mexcelle.data.model.contact.Regional
import com.mexcelle.data.repository.contact.dataSource.ContactRemoteDataSource
import com.mexcelle.data.repository.contact.dataSource.ContctLocalDataSource
import com.mexcelle.view.Advice.Advisoies
import com.mexcelle.view.contact.ContactActivity

import java.lang.Exception

class ContactRepositoryImpl(
    private val contctLocalDataSource: ContctLocalDataSource,
    private val contactRemoteDataSource: ContactRemoteDataSource
):ContactRepository
{

    override suspend fun getContact(): List<Regional> {
    return getContactFromDB()
    }

    suspend fun getCountryFromAPI(): List<Regional> {
         var countryList: List<Regional> =  ArrayList<Regional>()
        Log.e("response","running")

        try {
            val response = contactRemoteDataSource.getContact()
            val body = response.body()
            Log.e("response1", body.toString())
            if(body!=null){
                countryList=body.data.contacts.regional
                ContactActivity.shimmerFrameLayout!!.stopShimmerAnimation()
                ContactActivity.shimmerFrameLayout!!.visibility = View.GONE
                Log.e("response list",countryList.toString())

            }
        } catch (exception: Exception) {
            Log.e("MyTag", exception.message.toString())
        }
        return countryList
    }

    suspend fun getContactFromDB():List<Regional>{
         var countryList: List<Regional> =  ArrayList<Regional>()
        try {
            countryList = contctLocalDataSource.getContactFromDB()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(countryList.size>0){
            return countryList
        }else{
            countryList=getCountryFromAPI()
            contctLocalDataSource.saveContactToDB(countryList)
        }

        return countryList
    }



}








