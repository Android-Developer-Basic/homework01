package ru.otus.homework

import java.lang.IllegalArgumentException


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val arrayInt = IntArray(2)
    var catchTarget = false
    for (i in 0..(numbers.size - 1)) {
        val firstNumber = numbers[i]
        for (y in 0..(numbers.size - 1)) {
            if (y != i) {
                val secondNumber = numbers[y]
                if (firstNumber + secondNumber == target) {
                    arrayInt[0] = y
                    arrayInt[1] = i
                    catchTarget = true
                }
            }
        }
    }
    if (!catchTarget) {
        throw IllegalArgumentException("таких чисел нет")
    }
    return arrayInt
}






