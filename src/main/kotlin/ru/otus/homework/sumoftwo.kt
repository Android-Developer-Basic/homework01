package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for (i: Int in numbers.indices) {
        for (j: Int in i+1 until numbers.size) {
            if (numbers[i] + numbers[j] == target) {
                return intArrayOf(i,j)
            }
        }
    }
    throw IllegalArgumentException("Array doesn't contain two numbers equel to target")
}