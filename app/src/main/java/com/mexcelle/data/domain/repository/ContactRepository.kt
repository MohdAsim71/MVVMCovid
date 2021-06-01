package com.mexcelle.data.domain.repository

import com.mexcelle.data.model.contact.Regional

interface ContactRepository {
    suspend fun getContact():List<Regional>?

}