package com.mexcelle.data.repository.contact.dataSource

import com.mexcelle.data.model.contact.Regional

interface ContctLocalDataSource {
    suspend fun getContactFromDB():List<Regional>
    suspend fun saveContactToDB(artists:List<Regional>)
   // suspend fun clearAll()
}