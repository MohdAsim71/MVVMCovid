package com.example.kotlincovid19.pojoClass

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class CountriesDetails(

        @SerializedName("list")
        var list: ArrayList<CountriesDetailsItem>

)

@Entity(tableName = "country_details")
data class CountriesDetailsItem
(
        @PrimaryKey
        @SerializedName("country")
        var country: String,
        @SerializedName("cases")
        var cases: String,
        @SerializedName("todayCases")
        var todayCases: String,
        @SerializedName("recovered")
        var recovered: String,
        @SerializedName("active")
        var active: String,
        @SerializedName("deaths")
        var deaths: String,
        @SerializedName("todayDeaths")
        var todayDeaths: String,
        @SerializedName("critical")
        var critical: String,
        var isExpanded: Boolean = false

)