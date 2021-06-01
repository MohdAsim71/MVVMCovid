package com.mexcelle.data.model.hospitalsPojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
@Entity
data class HospitalResponse(
    @PrimaryKey
        @SerializedName("data")
        val data: HospitalsData,
    @SerializedName("lastOriginUpdate")
        val lastOriginUpdate: String,
    @SerializedName("lastRefreshed")
        val lastRefreshed: String,
    @SerializedName("success")
        val success: Boolean
)