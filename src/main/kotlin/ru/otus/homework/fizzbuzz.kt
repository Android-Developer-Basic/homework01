package ru.otus.homework

fun fizzbuzz(n: Int): Array<String> {
    val arr = Array<String>(n) { "" }
    for( i: Int in arr.indices ) {
        arr[i] = when {
            i == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            (i % 5 == 0) && (i % 3 == 0) -> "FizzBuzz"
            else -> i.toString()
        }
    }
    return arr
}