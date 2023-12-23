package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val result : MutableList<Int> = ArrayList()
    for (i in numbers.indices) {
        for(j in i + 1 until numbers.size) {
            if (numbers[i] + numbers[j] == target){
                result.add(i)
                result.add(j)
            }
        }
    }

    if(result.isEmpty()) throw  IllegalArgumentException()

    return result.toIntArray()
}