package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val result = Array(n) {""}
    for (i in 0 until n) {
        when {
            i % 15 == 0 -> result[i] = "FizzBuzz"
            i % 3 == 0 -> result[i] = "Fizz"
            i % 5 == 0 -> result[i] = "Buzz"
            else -> result[i] = i.toString()
        }
    }
    return result
}
