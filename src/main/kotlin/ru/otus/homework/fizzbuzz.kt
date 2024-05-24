package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val result = mutableListOf<String>()
    val fizz = "Fizz"
    val buzz = "Buzz"
    for (i in 0 until n) {
        when {
            (i % 3 == 0) && (i % 5 == 0) -> result.add("$fizz$buzz")
            (i % 3 == 0) -> result.add(fizz)
            (i % 5 == 0) -> result.add(buzz)
            else -> result.add(i.toString())
        }
    }
    return result.toTypedArray()
}