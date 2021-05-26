package com.mexcelle.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlincovid19.pojoClass.ContactDetails
@Dao

interface ContactDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveContact(artists : List<ContactDetails>)

    @Query("SELECT * FROM contact_details")
    suspend fun getContact():List<ContactDetails>
}