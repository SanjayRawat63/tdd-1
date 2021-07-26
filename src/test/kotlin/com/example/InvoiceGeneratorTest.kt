package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class InvoiceGeneratorTest : StringSpec({
    val invoiceGenerator = InvoiceGenerator()

    "generate the invoice with total fare, number of rides, average fare per ride" {
        val rides = listOf(Ride(10.0,7.0), Ride(3.0, 10.0))
        val invoice = invoiceGenerator.generate(rides)
        val expectedInvoice = Invoice(157.0, 2, 78.5)
        invoice shouldBe expectedInvoice
    }
})
