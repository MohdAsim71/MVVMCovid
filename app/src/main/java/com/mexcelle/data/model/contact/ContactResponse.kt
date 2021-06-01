package com.mexcelle.data.model.contact

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
@Entity
data class ContactResponse(
    @SerializedName("data")
    val data: Data,
    @SerializedName("lastOriginUpdate")
    val lastOriginUpdate: String,
    @SerializedName("lastRefreshed")
    val lastRefreshed: String,
    @SerializedName("success")
    val success: Boolean
)