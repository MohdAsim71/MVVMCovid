package com.mexcelle.data.repository.contact.dataSource

import com.mexcelle.data.model.contact.ContactResponse
import retrofit2.Response

interface ContactRemoteDataSource {
    suspend fun getContact(): Response<ContactResponse>

}