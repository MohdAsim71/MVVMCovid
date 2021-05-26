package com.mexcelle.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotlincovid19.pojoClass.*

@Database(entities =
[CountriesDetailsItem::class, ContactDetails::class, AdvisorieDetail::class,HospitalDetail::class,StateDetailes::class],
    version = 1, exportSchema = false)
    abstract class CovidDatabase: RoomDatabase() {
    abstract fun AdviceDao(): AdviceDao
    abstract fun ContactDao(): ContactDao
    abstract fun CountryDao(): CountryDao
    abstract fun HospitalDao(): HospitalDao
    abstract fun StateDao(): StateDao
}