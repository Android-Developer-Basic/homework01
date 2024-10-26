package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for (i in 0 until numbers.size - 1)
        if (numbers[i] + numbers[i+1] == target)
            return intArrayOf(i, i+1)
    throw IllegalArgumentException()
}