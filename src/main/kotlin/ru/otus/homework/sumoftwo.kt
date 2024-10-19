package ru.otus.homework

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for (i in 0 .. numbers.lastIndex) {
        for (ii in i+1 .. numbers.lastIndex) {
            if (numbers[i] + numbers[ii] == target) {
                return intArrayOf(i, ii)
            }
        }
    }
    throw IllegalArgumentException()
}

fun main() {
    val result = sumOfTwo(intArrayOf(2,7,11,15),9)
    println(result.contentToString())
}
