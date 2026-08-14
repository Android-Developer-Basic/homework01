package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val result: Array<String> = Array(n, {""})

    for(i in 0 .. n-1) {
        val s: String =
            when {
                i % 15 == 0 -> "FizzBuzz"
                i % 3 == 0 -> "Fizz"
                i % 5 == 0 -> "Buzz"
                else -> i.toString()
            }
        result.set(i, s)
    }
    return result
}