package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val result = Array(n) {""}
    for (i in 0..<n) {
        result[i] = when {
            i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> "$i"
        }
    }
    return result
}