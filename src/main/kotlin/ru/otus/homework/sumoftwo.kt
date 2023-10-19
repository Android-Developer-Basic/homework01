package ru.otus.homework

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for ((firstIndex, firstNumber) in numbers.withIndex()) {
        for (secondIndex in firstIndex + 1 until numbers.size) {
            if (firstNumber + numbers[secondIndex] == target)
                return intArrayOf(firstIndex, secondIndex)
        }
    }

    throw IllegalArgumentException()
}