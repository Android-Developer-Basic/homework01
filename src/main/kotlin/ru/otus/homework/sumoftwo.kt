package ru.otus.homework

import java.lang.IllegalArgumentException


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    //Check if args are valid
    if (numbers.size < 2 || target < 0) {
        throw IllegalArgumentException()
    }

    //Search for required elements
    for (i1 in numbers.indices) {
        for (i2 in i1 + 1 until numbers.size) {
            if (numbers[i1] + numbers[i2] == target) {
                return intArrayOf(i1, i2)
            }
        }
    }

    //If required elements were not found
    throw IllegalArgumentException()
}

fun main() {
    println(sumOfTwo(intArrayOf(2, 4, 5, 6, 1), 9).joinToString())
    println(sumOfTwo(intArrayOf(2, 4, 5, 6, 1), 8).joinToString())
}