package com.mexcelle.data.api

import com.example.kotlincovid19.pojoClass.*
import retrofit2.Response
import retrofit2.http.GET

interface CovidServices {

    @GET("countries")
    suspend fun getCountryData(): Response<List<CountriesDetailsItem>>

    @GET("https://api.rootnet.in/covid19-in/hospitals/medical-colleges")
    suspend fun getHospitalData(): Response<HospitalDetail>

    @GET("https://api.rootnet.in/covid19-in/contacts")
    suspend fun getContactDetails(): Response<ContactDetails>

    @GET("https://api.covidindiatracker.com/state_data.json")
    suspend fun getStateDetails(): Response<StateDetailes>


    @GET("https://api.rootnet.in/covid19-in/notifications")
    suspend fun getAdviceDetails(): Response<AdvisorieDetail>

}