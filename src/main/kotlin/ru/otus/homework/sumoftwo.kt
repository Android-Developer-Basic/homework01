package ru.otus.homework

fun main() {
    val target = 9
    val numbers = arrayOf(2, 7, 11, 15).toIntArray()
    sumOfTwo(numbers, target)
}

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var listIndexes = arrayOf<Int>().toIntArray()
    numbers.forEachIndexed { index, element ->
        for (i in 0 until numbers.size - 1) {
            if (numbers[i] + element == target) {
                if (!listIndexes.contains(index)) {
                    listIndexes += index
                }
                if (!listIndexes.contains(i)) {
                    listIndexes += i
                }

            }
        }
    }
    if (listIndexes.isEmpty()) {
        throw IllegalArgumentException("Elements not found")
    }
    println(listIndexes.contentToString())
    return listIndexes
}