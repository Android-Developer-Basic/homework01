package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for (i in 0 until numbers.size) {
        for (n in i + 1 until numbers.size) {
            if (numbers[i] + numbers[n] == target) {
                return intArrayOf(i, n)
            }
        }
    }
    throw IllegalArgumentException("IllegalArgumentException")
}