package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val result: Array<String> = Array(n) { "" }
    for (i in result.indices) {
        when {
            i % 3 == 0 && i % 5 == 0 -> result[i] = "FizzBuzz"
            i % 3 == 0 -> result[i] = "Fizz"
            i % 5 == 0 -> result[i] = "Buzz"
            else -> result[i] = i.toString()
        }
    }
    return result
}