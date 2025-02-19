package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val numMap = mutableMapOf<Int, Int>()
    for (i in numbers.indices) {
        val complement = target - numbers[i]
        if (numMap.containsKey(complement)) {
            return intArrayOf(numMap[complement]!!, i)
        }
        numMap[numbers[i]] = i
    }
    throw IllegalArgumentException("No two sum solution")
}