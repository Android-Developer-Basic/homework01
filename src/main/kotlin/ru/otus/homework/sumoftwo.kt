package ru.otus.homework

import kotlin.IllegalArgumentException as IllegalArgumentException


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val result = IntArray(2)

    for (i in 0 until numbers.size - 1) {
        for (j in 1 until numbers.size) {
            if ((numbers[i] + numbers[j]) == target) {
                result[0] = i
                result[1] = j
                return result
            }
        }
    }
    throw IllegalArgumentException("no pairs")
}