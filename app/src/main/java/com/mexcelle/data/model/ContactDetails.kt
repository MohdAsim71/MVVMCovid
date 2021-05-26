package com.example.kotlincovid19.pojoClass

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "contact_details")
data class ContactDetails (
    @PrimaryKey
    @SerializedName("state_name")
    var state_name: String,
    @SerializedName("phone")
    var phone: String
    )
