package ru.otus.homework

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val seen = mutableMapOf<Int, Int>()

    for (i in numbers.indices) {
        val complement = target - numbers[i]
        val complementIndex = seen[complement]

        if (complementIndex != null) {
            return intArrayOf(complementIndex, i)
        }

        seen[numbers[i]] = i
    }

    throw IllegalArgumentException("No two sum solution")
}