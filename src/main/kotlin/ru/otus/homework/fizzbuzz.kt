package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    return Array<String>(n) { i: Int -> getMappedValue(i) }
}

fun getMappedValue(i: Int): String {
    return if (i % 15 == 0) {
        "FizzBuzz"
    } else if (i % 5 == 0) {
        "Buzz"
    } else if (i % 3 == 0) {
        "Fizz"
    } else {
        "$i"
    }
}

fun main() {
    println(fizzbuzz(5).joinToString())
    println(fizzbuzz(10).joinToString())
}