package com.mexcelle.data.repository.contact.dataSourceImpl

import com.mexcelle.data.api.CovidServices
import com.mexcelle.data.model.contact.ContactResponse
import com.mexcelle.data.repository.contact.dataSource.ContactRemoteDataSource
import retrofit2.Response

class ContactRemoteDataSourceImpl(private val covidServices: CovidServices,
):ContactRemoteDataSource
{
    override suspend fun getContact(): Response<ContactResponse> =covidServices.getContactDetails()


}


