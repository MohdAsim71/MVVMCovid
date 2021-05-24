package com.mexcelle.mvvmcovid.repository.Country

import android.util.Log
import com.example.kotlincovid19.pojoClass.CountriesDetails
import com.mexcelle.mvvmcovid.domain.repository.CountryRepository
import com.mexcelle.mvvmcovid.repository.Country.dataSource.CountryLocalDataSource
import com.mexcelle.mvvmcovid.repository.Country.dataSource.CountryRemoteDataSource
import java.lang.Exception

class CountryRepositoryImpl(
    private val countryLocalDataSource: CountryLocalDataSource,
    private val countryRemoteDataSource: CountryRemoteDataSource
):CountryRepository
{
    override suspend fun getCountry(): List<CountriesDetails>? {
    return getCountryFromDB()
    }

    suspend fun getCountryFromAPI(): List<CountriesDetails> {
         var countryList: List<CountriesDetails> =  ArrayList<CountriesDetails>()
        try {
            val response = countryRemoteDataSource.getCountry()
            val body = response.body()
            Log.i("response",response.body().toString())
            if(body!=null){

                Log.e("response",response.body().toString())

            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return countryList
    }

    suspend fun getCountryFromDB():List<CountriesDetails>{
        lateinit var countryList: List<CountriesDetails>
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








