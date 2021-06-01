package com.mexcelle.data.model.contact

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "contact_details")
data class Regional(
    @PrimaryKey
    @SerializedName("number")
    var number: String,
    @SerializedName("loc")
    var loc: String

)