package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class InvoiceGeneratorTest : StringSpec({
    "calculate the total fare for one ride for a given distance" {
        val invoiceGenerator = InvoiceGenerator()
        val total = invoiceGenerator.totalFare(10.0)
        total shouldBe almost(105.0)
    }


})

private fun almost(value: Double) = value plusOrMinus (.001)