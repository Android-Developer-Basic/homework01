package ru.otus.homework

import kotlin.IllegalArgumentException as IllegalArgumentException

// 1 2 5 5 11, 4
fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val result = IntArray(2)

    for (i in numbers.indices) {
        for (j in 1 until numbers.size) {
            val a = numbers[i]
            val b = numbers[j]
            val sum = a + b
            if ((sum == target) && (a != b)) {
                result[0] = i
                result[1] = j
                return result
            }
        }
    }
    throw IllegalArgumentException("no pairs")
}