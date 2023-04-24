package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in numbers.indices) {
        val complement = target - numbers[i]
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[numbers[i]] = i
    }
    throw IllegalArgumentException("No two sum solution")
}