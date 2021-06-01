package com.mexcelle.data.domain.usecase

import com.mexcelle.data.domain.repository.ContactRepository
import com.mexcelle.data.model.contact.Regional

class ContactuseCases(private val contactRepository: ContactRepository) {
    suspend fun execute():List<Regional>? = contactRepository.getContact()

}


