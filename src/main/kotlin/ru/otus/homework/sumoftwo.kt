package ru.otus.homework

import java.lang.IllegalArgumentException


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val result = mutableListOf<Int>()

    for(i in 0 .. numbers.size - 1) {
        for(j in i + 1..numbers.size - 1) {
            if (numbers[i] + numbers[j] == target) {
                result.add(i)
                result.add(j)
            }
        }
    }

    if (result.isEmpty()) throw IllegalArgumentException()

    return result.toIntArray()
}