package ru.otus.homework

fun fizzbuzz(size: Int): Array<String> {
    val stringArray = Array(size) { "" }

    for(i in 0..<size) {
        stringArray[i] = if (i % 15 == 0) {
            "FizzBuzz"
        } else if (i % 3 == 0) {
            "Fizz"
        } else if (i % 5 == 0) {
            "Buzz"
        } else {
            "$i"
        }
    }

    return stringArray
}