package ru.otus.homework

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for (i in numbers.indices) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] + numbers[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    throw IllegalArgumentException("Нет подходящих чисел")
}

fun main() {
    val numbers = intArrayOf(2, 7, 11, 15)
    val target = 9
    try {
        val result = sumOfTwo(numbers, target)
        println(result.joinToString(", "))
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
