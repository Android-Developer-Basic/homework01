package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for (i in 0..numbers.lastIndex) {
        for (m in i + 1..numbers.lastIndex) {
            if (numbers[i] + numbers[m] == target)
                return intArrayOf(i, m)
        }
    }
    throw IllegalArgumentException()
}