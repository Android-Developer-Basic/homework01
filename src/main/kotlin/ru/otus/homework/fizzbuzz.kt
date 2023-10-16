package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
  val initial = Array<Int>(n) { it }

  return initial.map { item -> when {
    item % 3 == 0 && item % 5 == 0 || item == 0 -> "FizzBuzz"
    item % 3 == 0 -> "Fizz"
    item % 5 == 0 -> "Buzz"
    else -> "$item"
  }}.toTypedArray()
}

fun main() {
  println(fizzbuzz(5).contentToString())
}
