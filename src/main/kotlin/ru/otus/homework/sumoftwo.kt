package ru.otus.homework

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for (index in numbers.indices) {
        for (secondIndex in index + 1 until numbers.size) {
           if (numbers[index] + numbers[secondIndex] == target) {
               return intArrayOf(index, secondIndex)
           }
        }
    }
    throw IllegalArgumentException("Numbers not found")
}