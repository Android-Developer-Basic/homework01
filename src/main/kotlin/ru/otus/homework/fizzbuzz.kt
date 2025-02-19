package ru.otus.homework

fun fizzbuzz(n: Int): Array<String> {
    val array = Array(n) { it }
    var result = emptyArray<String>()

    for (x in array) {
        result += when {
            x == 0 || (x % 3 == 0 && x % 5 == 0) -> "FizzBuzz"
            x % 3 == 0 -> "Fizz"
            x % 5 == 0 -> "Buzz"
            else -> x.toString()
        }
    }

    return result
}
