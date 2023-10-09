package ru.otus.homework

const val ILLEGAL_ARGUMENT_MESSAGE = "There are no two numbers whose sum is equal to the "
const val OUTPUT_MESSAGE = "Indexes of elements, the sum of which is equal to "

fun sumOfTwo(numbers: IntArray, target: Int): List<Int> {
    for (i in numbers.indices) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] + numbers[j] == target) {
                return listOf(i, j)
            }
        }
    }
    throw IllegalArgumentException(ILLEGAL_ARGUMENT_MESSAGE + target)
}

fun main() {
    val numbers = readln().split(Regex("\\s+")).map { it.toInt() }.toIntArray()

    val target = readln().toInt()

    try {
        val result = sumOfTwo(numbers, target)

        println(OUTPUT_MESSAGE + "$target: ${result[0]}, ${result[1]}")

    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}