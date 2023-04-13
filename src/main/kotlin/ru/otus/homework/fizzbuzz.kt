package ru.otus.homework

fun fizzbuzz(n: Int): Array<String> {
    var i = 0
    var index = 0
    val arrayIn = Array(n) { i++ }
    var arrayOut = Array(n){""}
    arrayIn.forEach {
        when{
            (it%3==0 && it%5==0)|| it==0  -> arrayOut[index] = "FizzBuzz"
            it%3==0 -> arrayOut[index] = "Fizz"
            it%5==0 -> arrayOut[index] = "Buzz"
            else -> arrayOut[index] = "$it"
        }
        index++
    }
    return arrayOut
}