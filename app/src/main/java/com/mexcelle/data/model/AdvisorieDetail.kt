package com.example.kotlincovid19.pojoClass

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "advice_details")

class AdvisorieDetail(
    @PrimaryKey
    @SerializedName("tittle")
    var tittle: String,
    @SerializedName("link")
    var link: String
    )