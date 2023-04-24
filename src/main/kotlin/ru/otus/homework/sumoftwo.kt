package ru.otus.homework
fun main() {
    println(sumOfTwo(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7),5).contentToString())
}

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val array = Array(2) {0}
    for (i in numbers.indices) {
        for (j in i + 1..numbers.lastIndex) {
            if (numbers[i] + numbers[j] == target) {
                array [0] = i
                array [1] = j
                return intArrayOf(i, j)
            }
        }
    }
    //return array.toIntArray()
    throw Exception("IllegalArgumentException")
}