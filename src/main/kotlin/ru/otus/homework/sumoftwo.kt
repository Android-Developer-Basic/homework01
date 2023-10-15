package ru.otus.homework

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for (i in numbers.indices) {
        numbers.forEachIndexed forEach@{ index, element ->
            if (index == 0) return@forEach

            if (numbers[i] + element == target) {
                return intArrayOf(i, index)
            }
        }
    }

    throw IllegalArgumentException("not found")
}

