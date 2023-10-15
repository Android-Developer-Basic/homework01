package ru.otus.homework

fun fizzbuzz(n: Int): Array<String> {
    val fizzBuzz = "FizzBuzz"
    val fizz = "Fizz"
    val buzz = "Buzz"

    val numbers = Array(n) { i -> i }
    val strings = Array(n) { i -> i.toString() }

    numbers.forEach { i ->
        when {
            (i % 3 == 0) && (i % 5 == 0) -> strings[i] = fizzBuzz
            (i % 3 == 0) -> strings[i] = fizz
            (i % 5 == 0) -> strings[i] = buzz
            else -> strings[i] = "$i"
        }
    }

    return strings
}
