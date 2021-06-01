package com.mexcelle.data.model.contact

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity
data class Data(
    @SerializedName("contacts")
    val contacts: Contacts
)