package com.example.monmon.airticket.model

import com.google.gson.annotations.SerializedName
import java.time.Duration

data class Ticket(val from: String,
                  val to: String,
                  @SerializedName("flight_number") val flightNumber: String,
                    val departure: String,
                    val arrival: String,
                    val duration: String,
                    val instruction: String,
                    @SerializedName("stops")val numberOfShops: String)
                    {
}