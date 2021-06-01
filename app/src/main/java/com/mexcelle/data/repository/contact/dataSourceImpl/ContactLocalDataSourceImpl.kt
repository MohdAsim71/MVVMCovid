package com.mexcelle.data.repository.contact.dataSourceImpl

import com.mexcelle.data.db.ContactDao
import com.mexcelle.data.model.contact.Regional
import com.mexcelle.data.repository.contact.dataSource.ContctLocalDataSource

class ContactLocalDataSourceImpl(private val contactDao: ContactDao):ContctLocalDataSource
{


    override suspend fun getContactFromDB(): List<Regional> {
return contactDao.getContact()
    }

    override suspend fun saveContactToDB(artists: List<Regional>) {
    return contactDao.saveContact(artists)
    }


    /* override suspend fun clearAll() {

     }*/

}