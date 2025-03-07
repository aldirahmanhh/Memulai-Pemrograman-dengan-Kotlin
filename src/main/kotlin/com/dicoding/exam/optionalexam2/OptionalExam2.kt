package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val digit = number.toString().map { it.toString().toInt() }

    val minimal = digit.minOrNull() ?: 0
    val maksimal = digit.maxOrNull() ?: 0

    return minimal + maksimal
}
