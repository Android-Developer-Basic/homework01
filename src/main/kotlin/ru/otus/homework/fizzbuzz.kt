@file:Suppress("UNREACHABLE_CODE")

package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {

        return Array(n) { i ->
            when {
                (i + 1) % 3 == 0 && (i + 1) % 5 == 0 -> "FizzBuzz"
                (i + 1) % 3 == 0 -> "Fizz"
                (i + 1) % 5 == 0 -> "Buzz"
                else -> (i + 1).toString()
            }
        }
    }

    fun main() {
        val n = 15 // Размер массива
        val result = fizzbuzz(n)
        println(result.joinToString())
    }
