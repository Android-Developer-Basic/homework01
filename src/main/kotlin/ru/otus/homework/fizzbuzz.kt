package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    var array: Array<String> = emptyArray()

    for (i in 0..<n) {
        array += when {
            i % 3 == 0 && i % 5 == 0 -> {
                "FizzBuzz"
            }

            i % 5 == 0 -> {
                "Buzz"
            }

            i % 3 == 0 -> {
                "Fizz"
            }

            else -> {
                i.toString()
            }
        }
    }

    return array
}