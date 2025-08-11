package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val diffMap = mutableMapOf<Int, Int>()
    numbers.forEachIndexed { index, int ->
        diffMap[int]?.let { return intArrayOf(it, index) }
        diffMap[target - int] = index
    }
    throw IllegalArgumentException()
}
