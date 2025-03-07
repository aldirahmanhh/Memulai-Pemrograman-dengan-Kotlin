package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(input: String): String {
    require(input.length in 1..100) { "Input panjang String 1 sampai 100" }
    val length = input.length
    return if (length % 2 == 0) {
        input.substring((length / 2) - 1, (length / 2) + 1)
    } else {
        input.substring(length / 2, (length / 2) + 1)
    }
}
