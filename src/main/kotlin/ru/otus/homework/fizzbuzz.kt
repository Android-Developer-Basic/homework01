package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val intArray = IntArray(n) { it }
    var result = emptyArray<String>()
    for (i in intArray) {
        var e = ""
        if (i % 3 == 0) {
            e += "Fizz"
        }
        if (i % 5 == 0) {
            e += "Buzz"
        }
        result += e.ifEmpty { i.toString() }
    }
    return result
}