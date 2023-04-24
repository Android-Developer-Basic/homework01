package ru.otus.homework
fun main() {
    println(fizzbuzz(16).contentToString())
}

fun fizzbuzz(n: Int): Array<String> {
    var i = 0
    val array = Array(n) { i++ }
    val array2 = Array(n) {""}
    for (x in array) {
        if ((x == 0) || (x%5 == 0 && x%3 == 0)) {
            array2[x] = "FizzBuzz"
        } else if (x%3 == 0) {
            array2[x] = "Fizz"
        } else if (x%5 == 0) {
            array2[x] = "Buzz"
        } else {
            array2[x] = x.toString()
        }
    }
    return array2
}