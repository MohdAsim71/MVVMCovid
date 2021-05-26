package com.mexcelle.data.repository.country

import android.util.Log
import com.example.kotlincovid19.pojoClass.CountriesDetailsItem
import com.mexcelle.data.domain.repository.CountryRepository
import com.mexcelle.data.repository.country.dataSource.CountryLocalDataSource
import com.mexcelle.data.repository.country.dataSource.CountryRemoteDataSource
import java.lang.Exception

class CountryRepositoryImpl(
    private val countryLocalDataSource: CountryLocalDataSource,
    private val countryRemoteDataSource: CountryRemoteDataSource
):CountryRepository
{
    override suspend fun getCountry(): List<CountriesDetailsItem> {
    return getCountryFromDB()
    }

    suspend fun getCountryFromAPI(): List<CountriesDetailsItem> {
         var countryList: List<CountriesDetailsItem> =  ArrayList<CountriesDetailsItem>()
        Log.e("response","running")

        try {
            val response = countryRemoteDataSource.getCountry()
            val body = response.body()
            Log.e("response1", body.toString())
            if(body!=null){
                countryList=body

                Log.e("response list",countryList.toString())

            }
        } catch (exception: Exception) {
            Log.e("MyTag", exception.message.toString())
        }
        return countryList
    }

    suspend fun getCountryFromDB():List<CountriesDetailsItem>{
         var countryList: List<CountriesDetailsItem> =  ArrayList<CountriesDetailsItem>()
        try {
            countryList = countryLocalDataSource.getCountryFromDB()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(countryList.size>0){
            return countryList
        }else{
            countryList=getCountryFromAPI()
            countryLocalDataSource.saveCountryToDB(countryList)
        }

        return countryList
    }


}








