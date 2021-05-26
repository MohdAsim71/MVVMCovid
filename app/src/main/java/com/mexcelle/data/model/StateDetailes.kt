package com.example.kotlincovid19.pojoClass

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "state_details")

class StateDetailes (

    @PrimaryKey
    @SerializedName("state_name")
    var state_name: String,
    @SerializedName("active")
    var active: String,
    @SerializedName("confirm")
    var confirm: String,
    @SerializedName("recovered")
    var recovered: String,
    @SerializedName("death")
    var death: String,
    var isExpanded:Boolean = false

   /* constructor(
        state_name: String?,
        active: String?,
        confirm: String?,
        recovered: String?,
        death: String?
    ) {
        this.state_name = state_name
        this.active = active
        this.confirm = confirm
        this.recovered = recovered
        this.death = death
         isExpanded = false

    }



*/
)
