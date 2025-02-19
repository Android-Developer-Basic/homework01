package ru.otus.homework

fun main() {
    val value = 10
    println(fizzbuzz(value).contentToString())
}

fun fizzbuzz(n: Int): Array<String> {
    val listInt = (0..<n).toList()
    var listString = arrayOf<String>()

    for (i: Int in listInt) {
        listString += if (i % 3 == 0 && i % 5 == 0) {
            "FizzBuzz"
        } else if (i % 3 == 0) {
            "Fizz"
        } else if (i % 5 == 0) {
            "Buzz"
        } else {
            i.toString()
        }
    }
    return listString
}
