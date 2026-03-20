package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val resArr = Array(n) {""}

    if (n == 0) {
        return resArr
    }

    for (i in 0..n) {
        when {
            ((i % 5 == 0) && (i % 3 == 0)) || (i == 0) -> resArr[i] = "FizzBuzz"
            (i % 3 == 0) -> resArr[i] = "Fizz"
            (i % 5 == 0) -> resArr[i] = "Buzz"
            else -> resArr[i] = "$i"
        }
    }

    return resArr
}