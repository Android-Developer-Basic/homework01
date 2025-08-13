package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    /* Функция не требует никаких дополнительных проверок. Т.к. либо исключение, либо пустой массив. */
    val nArr = Array<Int>(n, {it})
    val sRes = Array<String>(n, {""})
    for ((i, v) in nArr.withIndex()) {
        sRes[i] = if (v == 0 || ((v % 3 == 0) && (v % 5 == 0))) {
            "FizzBuzz"
        } else if (v % 5 == 0) {
            "Buzz"
        } else if (v % 3 == 0) {
            "Fizz"
        } else "$v"
    }
    return sRes
}