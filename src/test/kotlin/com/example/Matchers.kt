package com.example

import io.kotest.matchers.doubles.plusOrMinus

fun almost(value: Double) = value plusOrMinus (.001)