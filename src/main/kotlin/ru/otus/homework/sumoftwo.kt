package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val result = mutableListOf<Int>()
    for (i in 0 until numbers.size - 1) {
        if (numbers[i] + numbers[i + 1] == target) {
            result.add(i)
            result.add(i + 1)
            break
        }
    }
    if (result.size == 0) throw IllegalArgumentException()
    return result.toIntArray()
}