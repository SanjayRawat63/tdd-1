package com.example

class InvoiceGenerator {
    fun generate(rides: List<Ride>): Invoice {
        val totalFare = rides.sumOf { ride -> ride.fare() }
        val numberOfRides = rides.size
        val averageFarePerRide = totalFare / numberOfRides
        return Invoice(totalFare, numberOfRides, averageFarePerRide)
    }

}
