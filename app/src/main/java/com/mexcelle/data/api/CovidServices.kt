package com.mexcelle.data.api

import com.example.kotlincovid19.pojoClass.*
import com.mexcelle.data.model.CountriesDetailsItem
import com.mexcelle.data.model.advice.AdviceResponseData
import com.mexcelle.data.model.contact.ContactResponse
import com.mexcelle.data.model.hospitalsPojo.HospitalResponse
import retrofit2.Response
import retrofit2.http.GET

interface CovidServices {

    @GET("countries")
    suspend fun getCountryData(): Response<List<CountriesDetailsItem>>

    @GET("hospitals/medical-colleges")
    suspend fun getHospitalData(): Response<HospitalResponse>

    @GET("contacts")
    suspend fun getContactDetails(): Response<ContactResponse>

    @GET("https://api.covidindiatracker.com/state_data.json")
    suspend fun getStateDetails(): Response<StateDetailes>

    @GET("notifications")
    suspend fun getAdviceDetails(): Response<AdviceResponseData>

}