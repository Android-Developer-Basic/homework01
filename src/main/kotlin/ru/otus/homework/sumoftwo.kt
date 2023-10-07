package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray =
    sumOfTwo(numbers, target, intArrayOf())

private fun sumOfTwo(numbers: IntArray, target: Int, usedIndices: IntArray): IntArray {
    val indexOfTarget = numbers.indexOf(target)
    if (indexOfTarget >= 0 && !usedIndices.contains(indexOfTarget)) {
        return usedIndices + intArrayOf(indexOfTarget)
    }
    for ((index, value) in numbers.withIndex()) {
        if (!usedIndices.contains(index) && value < target) {
            try {
                return sumOfTwo(
                    numbers,
                    target - value,
                    usedIndices + index
                )
            } catch (_: IllegalArgumentException) {
                continue
            }
        }
    }
    throw IllegalArgumentException()
}