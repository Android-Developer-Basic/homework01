package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    if (numbers.isEmpty())
        throw IllegalArgumentException("Input array 'numbers' is empty.")

    val diffMap = mutableMapOf<Int, Int>()
    for (i in numbers.indices) {
        val complement = target - numbers[i]
        diffMap[complement]?.let { return intArrayOf(it, i) }
        diffMap[numbers[i]] = i
    }
    throw IllegalArgumentException("No two numbers sum up to the target.")
}