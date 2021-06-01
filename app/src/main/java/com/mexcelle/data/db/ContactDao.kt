package com.mexcelle.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mexcelle.data.model.contact.Regional

@Dao

interface ContactDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveContact(artists : List<Regional>)

    @Query("SELECT * FROM contact_details")
    suspend fun getContact():List<Regional>
}