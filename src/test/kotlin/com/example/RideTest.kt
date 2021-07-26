package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class RideTest : StringSpec({
    "calculate the total fare for one ride for a given distance" {
        val total = Ride(10.0, 0.0).fare()
        total shouldBe almost(105.0)
    }

    "calculate the total fare for a given distance and duration" {
        val total = Ride(10.0, 7.0).fare()
        total shouldBe almost(112.0)
    }
})