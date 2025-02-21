package ru.otus.homework

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    if (numbers.size<2) throw IllegalArgumentException()

    for (i in numbers.indices){
        for (j in i+1..<numbers.size) {
            if (numbers[i]+numbers[j] == target) return intArrayOf(i, j)
        }
    }

    throw IllegalArgumentException()
}