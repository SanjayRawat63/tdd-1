package com.example

class InvoiceGenerator {
    fun totalFare(distance: Double, duration: Double): Double {
        return distance * 10 + duration * 1 + 5
    }

}
