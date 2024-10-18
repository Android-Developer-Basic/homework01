package ru.otus.homework

fun fizzbuzz(n: Int): Array<String> {
    var result = emptyArray<String>()
    for (i in 0..n-1) {
        if (i % 3 == 0 && i % 5 == 0) {
            result += "FizzBuzz"
        } else if (i % 3 == 0) {
            result += "Fizz"
        } else if (i % 5 == 0) {
            result += "Buzz"
        } else {
            result += "$i"
        }
    }
    return result
}

fun main() {
    val result = fizzbuzz(5)
    println(result.contentToString())
}

