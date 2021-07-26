package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class InvoiceGeneratorTest : StringSpec({
    val invoiceGenerator = InvoiceGenerator()

    "calculate the total fare given multiple rides" {
        val rides = listOf(Ride(10.0,7.0), Ride(3.0, 10.0))
        val total = invoiceGenerator.totalFare(rides)
        total shouldBe almost(157.0)
    }
})
