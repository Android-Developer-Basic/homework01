package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var result: IntArray? = null

    numbers.forEachIndexed { index, value ->
        for ( innerIndex in index + 1 ..< numbers.size) {
            if (value + numbers[innerIndex] == target) {
                result = intArrayOf(index, innerIndex)
            }
        }

    }

    if (result == null) {
        throw IllegalArgumentException()
    }
    return result as IntArray
}