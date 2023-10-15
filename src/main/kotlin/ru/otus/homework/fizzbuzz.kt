package ru.otus.homework

fun fizzbuzz(n: Int): Array<String> {
    val incomingArray = prepareArray(n)
    val resultArray = Array(n) { "" }

    incomingArray.forEachIndexed { index, i -> resultArray[index] = detectNumber(i) }

    return resultArray
}

internal fun prepareArray(size: Int): Array<Int> = Array(size) { i -> i }

internal fun detectNumber(num: Int): String {
    if (num == 0 || (num % 3 == 0) && (num % 5 == 0)) {
        return "FizzBuzz"
    }
    if (num % 3 == 0) {
        return "Fizz"
    }
    if (num % 5 == 0) {
        return "Buzz"
    }

    return num.toString()
}