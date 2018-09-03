package com.example.monmon.airticket.network

import com.example.monmon.airticket.model.Ticket
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface MainService {
    @GET("airline-tickets.php")
    fun searchTickets(@Query("from") from:String,@Query("to") to: String): Single<List<Ticket>>

    @GET("airline-tickets-price.php")
    fun getPrice(@Query("flight_number") flightnumber:String,@Query("from") from:String,@Query("to") to: String )
}