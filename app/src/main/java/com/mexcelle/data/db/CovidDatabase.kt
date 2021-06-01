package com.mexcelle.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotlincovid19.pojoClass.*
import com.mexcelle.data.model.CountriesDetailsItem
import com.mexcelle.data.model.advice.NotificationData
import com.mexcelle.data.model.contact.Regional
import com.mexcelle.data.model.hospitalsPojo.MedicalCollege

@Database(entities =
[CountriesDetailsItem::class, Regional::class, NotificationData::class,MedicalCollege::class,StateDetailes::class],
    version = 1, exportSchema = false)
    abstract class CovidDatabase: RoomDatabase() {
    abstract fun AdviceDao(): AdviceDao
    abstract fun ContactDao(): ContactDao
    abstract fun CountryDao(): CountryDao
    abstract fun HospitalDao(): HospitalDao
    abstract fun StateDao(): StateDao
}