package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    if (numbers.size < 2) throw IllegalArgumentException()

    for ((k, value) in numbers.withIndex()) {
        for ((i, value) in numbers.withIndex()) {
            if (k == i) {
                continue
            } else {
                if (numbers[k] + numbers[i] == target) {
                    return intArrayOf(k, i)
                }
            }
        }
    }

    throw IllegalArgumentException()
}
