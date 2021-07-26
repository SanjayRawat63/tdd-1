package com.example

data class Invoice(val rides: List<Ride>){
    fun totalFare() = rides.sumOf { ride -> ride.fare() }
    fun numberOfRides() = rides.size
    fun averageFarePerRide() = totalFare() / numberOfRides()
}

