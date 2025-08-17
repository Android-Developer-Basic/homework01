package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    val indicesArr = mutableListOf<Int>()
    
    numbers.forEach { i ->
        val pivot = i
        numbers.forEachIndexed { index, i ->
            if (pivot + i == target) {
                indicesArr.add(index)
            }
        }
    }

    if (indicesArr.isEmpty()) {
        throw IllegalArgumentException()
    }

    return indicesArr.sorted().toIntArray()
}