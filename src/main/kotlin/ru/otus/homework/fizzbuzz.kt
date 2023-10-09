package ru.otus.homework

const val FIZZ_BUZZ = "FizzBuzz"
const val FIZZ = "Fizz"
const val BUZZ = "Buzz"
const val SEPARATOR = ", "
fun fizzbuzz(n: Int): List<String> {
    val result = mutableListOf<String>()

    for (i in 0 until n) {
        when {
            (i % 3 == 0) && (i % 5 == 0) -> result.add(FIZZ_BUZZ)
            (i % 3 == 0) -> result.add(FIZZ)
            (i % 5 == 0) -> result.add(BUZZ)
            else -> result.add(i.toString())
        }
    }
    return result
}

fun main() {
    val n = readln().toInt()
    val fizzbuzzResult = fizzbuzz(n)
    println(fizzbuzzResult.joinToString(SEPARATOR))
}