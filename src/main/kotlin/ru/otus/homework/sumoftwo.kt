package ru.otus.homework

import java.lang.IllegalArgumentException


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val indexes = ArrayList<Int>()

    for((index, currentValue) in numbers.withIndex()) {
        for (i in 1 until numbers.size) {
                if (currentValue + numbers[i] == target) {
                    indexes.add(index)
                    indexes.add(i)
                    return indexes.toIntArray()
                }
        }
    }

    throw IllegalArgumentException("Сумма не найдена!")

}