package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    return Array(n) {
        when {
            it % 15 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> "$it"
        }
    }
}