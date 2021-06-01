package com.mexcelle.data.model.advice

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
@Entity
data class AdviceResponseData(
    @SerializedName("data")
    val data: AdviceData,
    @SerializedName("lastOriginUpdate")
    val lastOriginUpdate: String,
    @SerializedName("lastRefreshed")
    val lastRefreshed: String,
    @SerializedName("success")
    val success: Boolean
)