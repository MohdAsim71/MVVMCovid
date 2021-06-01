package com.mexcelle.data.model.contact

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity
data class Primary(
    @SerializedName("email")
    val email: String,
    @SerializedName("facebook")
    val facebook: String,
    @SerializedName("media")
    val media: List<String>,
    @SerializedName("number")
    val number: String,
    @SerializedName("twitter")
    val twitter: String
)