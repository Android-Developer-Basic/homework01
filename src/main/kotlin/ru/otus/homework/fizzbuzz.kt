package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val result: Array<String> = Array(n) { "" }

    for (i in 0..<n) result[i] =
        if (i == 0 || i % 15 == 0) {
            "FizzBuzz"
        } else if (i % 5 == 0) {
            "Buzz"
        } else if (i % 3 == 0) {
            "Fizz"
        } else {
            i.toString()
        }

    return result
}