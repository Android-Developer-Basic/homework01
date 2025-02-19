package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val numbers = Array(n) {it}
    val result = Array(n) {""}

    for (i in numbers.indices) {
        result[i] = when {
            numbers[i] % 15 == 0 -> "FizzBuzz"
            numbers[i] % 3 == 0 -> "Fizz"
            numbers[i] % 5 == 0 -> "Buzz"
            else -> numbers[i].toString()
        }
    }
    return result
}