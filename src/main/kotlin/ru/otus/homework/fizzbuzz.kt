package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val array = Array(n) { i ->
        when {
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> "$i"
        }
    }
    return array
}