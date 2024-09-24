package ru.otus.homework

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val indexes = mutableMapOf<Int, Int>()

    for ((index, number) in numbers.withIndex()) {
        val difference = target - number

        if (indexes.containsKey(difference)) {
            return intArrayOf(indexes[difference]!!, index)
        } else {
            indexes[number] = index
        }
    }

    throw IllegalArgumentException()
}
