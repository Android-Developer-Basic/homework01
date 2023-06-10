package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    (1 until numbers.size).forEach { i ->
        if (numbers[i - 1] + numbers[i] == target) {
            return intArrayOf(i - 1, i)
        }
    }
    throw IllegalArgumentException()
}