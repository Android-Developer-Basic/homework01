package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val result = Array(n) {
        when {
            it % 15 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
    }
    return result
}