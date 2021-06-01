package com.mexcelle.data.model.contact

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity
data class Contacts(
    @SerializedName("primary")
    val primary: Primary,
    @SerializedName("regional")
    val regional: List<Regional>
)