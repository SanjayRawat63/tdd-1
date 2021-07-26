package com.example

class InvoiceGenerator {
    companion object {
        val FARE_PER_KM = 10
        val FARE_PER_MINUTE = 1
        val BOOKING_CHARGES = 5
    }

    fun totalFare(distance: Double, duration: Double): Double {
        return distance * FARE_PER_KM + duration * FARE_PER_MINUTE + BOOKING_CHARGES
    }

    fun totalFare(rides: List<Ride>): Double {
        return rides.sumOf { ride -> totalFare(ride.distance, ride.duration) }
    }

}
