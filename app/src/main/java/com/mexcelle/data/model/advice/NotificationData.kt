package com.mexcelle.data.model.advice

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "advice_details")
data class NotificationData(
    @PrimaryKey
    @SerializedName("title")
    var title: String,
    @SerializedName("link")
    var link: String
)