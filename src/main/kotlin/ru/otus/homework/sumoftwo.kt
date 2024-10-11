package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val map = HashMap<Int,Int>()
    numbers.forEachIndexed { index, item ->
        val firstMatchedItem = map[target - item]
        firstMatchedItem?.run{
            return intArrayOf(firstMatchedItem, index)
        }
        map[item] = index
    }
    throw IllegalArgumentException()
}