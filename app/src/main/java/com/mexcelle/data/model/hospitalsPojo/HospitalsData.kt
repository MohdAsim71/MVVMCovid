package com.mexcelle.data.model.hospitalsPojo

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
@Entity
data class HospitalsData(
        @SerializedName("medicalColleges")
        val medicalColleges: List<MedicalCollege>,
        @SerializedName("sources")
        val sources: List<String>
)