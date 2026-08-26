package ru.otus.homework
fun fizzbuzz(n: Int): Array<String> {
    TODO("Выполните задание")
}fun main() {
    fun fizzBuzz(i: Int) = when {
        i % 15 == 0 -> "FizzBuzz"
        i % 3 == 0 -> "Fizz"
        i % 5 == 0 -> "Buzz"
        else -> "$i"
    }
    for (i in 0..15) {
        println(fizzBuzz(i))
    }
}