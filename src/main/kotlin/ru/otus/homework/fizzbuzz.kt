package ru.otus.homework

fun fizzbuzz(n: Int): Array<String> {
    val result = mutableListOf<String>()
    for (i in 0 until n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> result.add("FizzBuzz")
            i % 3 == 0 -> result.add("Fizz")
            i % 5 == 0 -> result.add("Buzz")
            else -> result.add(i.toString())
        }
    }
    return result.toTypedArray()
}

fun main() {
    val n = 5
    val fizzBuzzOutput = fizzbuzz(n)
    println(fizzBuzzOutput.joinToString(", "))
}
