package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    var i = 0
    val arr = Array(n) { i++ }
    val result = Array(n) { "" }
    val fizz = "Fizz"
    val buzz = "Buzz"
    val fizzBuzz = "$fizz$buzz"

    arr.forEach {
        when{
            it == 0 || it % 5 == 0 && it % 3 == 0 -> result[it] = fizzBuzz
            it % 3 == 0 -> result[it] = fizz
            it % 5 == 0 -> result[it] = buzz
            else -> result[it] = it.toString()
        }
    }

    return result
}