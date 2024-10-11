package ru.otus.homework

fun main() {
    println(sumOfTwo(intArrayOf(2, 7, 11, 15), target = 9).contentToString())
}

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val indexesList = mutableListOf<Int>()

    numbers.forEachIndexed { index, valueFirst ->

        for (nextIndex in index + 1 until numbers.size) {

            if (valueFirst + numbers[nextIndex] == target) {
                indexesList.add(index)
                indexesList.add(nextIndex)
            }
        }
    }

    if (indexesList.size > 0) {
        val indexesArray = indexesList.toIntArray()
        return indexesArray
    } else {
        throw IllegalArgumentException("There are no such numbers")
    }
}