package com.mexcelle.data.model.hospitalsPojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "hospital_details")
data class MedicalCollege(
        @SerializedName("admissionCapacity")
        val admissionCapacity: Int,
        @SerializedName("city")
        val city: String,
        @SerializedName("hospitalBeds")
        val hospitalBeds: Int,
        @SerializedName("name")
        @PrimaryKey
        val name: String,
        @SerializedName("ownership")
        val ownership: String,
        @SerializedName("state")
        val state: String,
        var isExpanded:Boolean = false

)