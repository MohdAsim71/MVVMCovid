package com.mexcelle.data.model.advice

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
@Entity
data class AdviceData(
    @SerializedName("notifications")
    val notifications: List<NotificationData>
)