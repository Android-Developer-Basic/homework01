package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var i = -1
    while (++i < numbers.size - 1)
    {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] + numbers[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    throw IllegalArgumentException()
}