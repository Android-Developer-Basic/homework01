package ru.otus.homework

fun main() {
    val n = 5
    fizzbuzz(n)
}

fun fizzbuzz(n: Int): Array<String> {
    var i = 0
    val numbers = Array(n) { i++ }
    val string = Array<String>(numbers.size) { "" }
    return string
}