package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val array = Array(n) { index ->
        when {
            index == 0 -> "FizzBuzz"
            index % 15 == 0 -> "FizzBuzz"
            index % 3 == 0 -> "Fizz"
            index % 5 == 0 -> "Buzz"
            else -> index.toString()
        }
    }
    return array
}
