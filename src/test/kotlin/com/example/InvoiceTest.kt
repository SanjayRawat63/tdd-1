package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class InvoiceTest : StringSpec({
    val rides = listOf(Ride(10.0,7.0), Ride(3.0, 10.0))
    val invoice = Invoice(rides)

    "generate the total fare for both rides" {
        invoice.totalFare() shouldBe almost(157.0)
    }

    "calculate the number of rides" {
        invoice.numberOfRides() shouldBe 2
    }
    "calculate the average fare per ride" {
        invoice.averageFarePerRide() shouldBe almost(78.5)
    }
})
