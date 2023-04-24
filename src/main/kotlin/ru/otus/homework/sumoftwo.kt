package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val result: IntArray = intArrayOf(0, 0)

    if (1 !in numbers.indices) {
        println("Входной массив состоит из одного элемента")
        throw IllegalArgumentException()
    }
    var j = 0
    for (i in numbers.indices) {
        j = i + 1
        while (j in numbers.indices) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i
                result[1] = j
                return result
            }
            j++
        }
    }
    println("Нет решения")
    throw IllegalArgumentException()
}