package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for ((i, v) in numbers.withIndex()) {
        for (j in i + 1 until numbers.count()) {
            if (v + numbers[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    throw IllegalArgumentException("No result")
}