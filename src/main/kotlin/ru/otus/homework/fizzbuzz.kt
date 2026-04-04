package ru.otus.homework

fun fizzbuzz(n: Int): Array<String> {
    return Array(n) { value ->
        when {
            value % 15 == 0 -> "FizzBuzz"
            value % 3 == 0 -> "Fizz"
            value % 5 == 0 -> "Buzz"
            else -> value.toString()
        }
    }
}