package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for (i in numbers.indices) {
        for (k in i + 1 until numbers.size) {
            if (numbers[i] + numbers[k] == target) {
                return intArrayOf(i, k)
            }
        }
    }
    throw IllegalArgumentException()
}