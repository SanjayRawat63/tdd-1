package com.example

class InvoiceGenerator {
    fun totalFare(rides: List<Ride>): Double {
        return rides.sumOf { ride -> ride.fare() }
    }

}
