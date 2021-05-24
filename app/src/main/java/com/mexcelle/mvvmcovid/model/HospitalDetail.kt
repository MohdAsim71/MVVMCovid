package com.example.kotlincovid19.pojoClass
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "hospital_details")
class HospitalDetail (

    @PrimaryKey
    @SerializedName("name")
    var name: String,
    @SerializedName("state_name")
    var state_name: String,
    @SerializedName("city")
    var city: String,
    @SerializedName("capacity")
    var capacity: String,
    @SerializedName("ownership")
    var ownership: String,
    @SerializedName("beds")
    var beds: String,
    var isExpanded:Boolean = false



)
