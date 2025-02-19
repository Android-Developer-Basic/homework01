package ru.otus.homework

fun main() {
    println(
        twoSum(nums = intArrayOf(2, 5, 5, 11), target = 10).joinToString(
            separator = ", ",
            prefix = "[",
            postfix = "]"
        )
    )
}


fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (s in nums.indices) {
            if (s != 0 && s != i) {
                if (nums[i] + nums[s] == target) {
                    return intArrayOf(i, s)
                }
            }
        }
    }

    throw IllegalArgumentException("Error")
}