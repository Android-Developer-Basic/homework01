package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val nums = hashMapOf<Int, Int>()

    for (idx in numbers.indices) {
        val secondIdx = nums[target - numbers[idx]]

        if (secondIdx != null) {
            return intArrayOf(idx, secondIdx)
        }

        nums[numbers[idx]] = idx
    }

    throw IllegalArgumentException("no target number in input array")
}