package com.example

data class Ride(val distance: Double, val duration: Double) {
    companion object {
        val FARE_PER_KM = 10
        val FARE_PER_MINUTE = 1
        val BOOKING_CHARGES = 5
    }

    fun fare(): Double {
        return distance * FARE_PER_KM + duration * FARE_PER_MINUTE + BOOKING_CHARGES
    }
}
