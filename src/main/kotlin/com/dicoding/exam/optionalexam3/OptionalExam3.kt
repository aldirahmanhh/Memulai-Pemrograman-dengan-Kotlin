package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    require(int in 1..100) { "Input rentang dari 1 sampai 100" }

    val angkaKeString = str.filter { it.isDigit() }.toString()

    return if (angkaKeString.isNotEmpty()) {
        val ekstrakNomor = angkaKeString.toInt()
        val hasilMulti = ekstrakNomor * int

        str.replace(angkaKeString, hasilMulti.toString())
    } else {
        "$str$int"
    }
}
