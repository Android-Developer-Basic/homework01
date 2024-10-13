package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    if (n == 0) {
        return emptyArray()
    }
    val result = Array(n) { i -> if (i == 0) "FizzBuzz" else i.toString()}
    for (i in 1..< n) {
        var resultString = ""
        if (i % 3 == 0) {
            resultString += "Fizz"
        }
        if (i % 5 == 0) {
            resultString += "Buzz"
        }
        if (resultString.isNotEmpty()) {
            result[i] = resultString
        }
    }
    return result
}