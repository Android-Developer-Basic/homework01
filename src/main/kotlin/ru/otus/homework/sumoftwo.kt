package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val arrayInt: IntArray

    for (i in 0 until numbers.lastIndex) {
        for (f in i + 1..numbers.lastIndex) {
            if (numbers[i] + numbers[f] == target) {
                arrayInt = intArrayOf(i,f)
                return arrayInt
            }
        }
    }
    throw IllegalArgumentException("Таких чисел нет")
}