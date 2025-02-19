package ru.otus.homework

fun sumOfTwo(array: Array<Int>, target: Int): Array<Int> {
    for (i in 0..<array.size - 1) {
        for (j in i + 1..<array.size) {
            if (array[i] + array[j] == target) return arrayOf(i, j)
        }
    }

    throw IllegalArgumentException("No value")
}
