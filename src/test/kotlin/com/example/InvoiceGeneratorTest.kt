package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class InvoiceGeneratorTest : StringSpec({
    val invoiceGenerator = InvoiceGenerator()

    "calculate the total fare for one ride for a given distance" {
        val total = invoiceGenerator.totalFare(10.0, 0.0)
        total shouldBe almost(105.0)
    }

    "calculate the total fare for a given distance and duration" {
        val total = invoiceGenerator.totalFare(10.0, 7.0)
        total shouldBe almost(112.0)
    }

    "calculate the total fare given multiple rides" {
        val rides = listOf(Ride(10.0,7.0), Ride(3.0, 10.0))
        val total = invoiceGenerator.totalFare(rides)
        total shouldBe almost(157.0)
    }

})

private fun almost(value: Double) = value plusOrMinus (.001)