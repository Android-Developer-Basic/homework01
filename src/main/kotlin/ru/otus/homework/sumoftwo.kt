package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val size = numbers.count() - 1
    val result: ArrayList<Int> = ArrayList<Int>()
    loop@ for (i in numbers.indices) {
        for (j in i + 1..size) {
            if (numbers[i] + numbers[j] == target) {
                result.add(i)
                result.add(j)
                break@loop
            }
        }
    }

    if (result.isEmpty()) {
        throw IllegalArgumentException("Not found")
    }

    return result.toIntArray()
}