package ru.otus.homework

fun main() {
    sumOfTwo(intArrayOf(2, 7, 11, 15, 3, 6), target = 9)
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

    return numbers
}