package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val result: IntArray = intArrayOf(0, 0)

    if (1 !in numbers.indices) {
        throw Exception("Входной массив состоит из одного элемента")
    }
    var j: Int = 0
    for (i in numbers.indices) {
        j = i + 1
        while (j in numbers.indices) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i
                result[1] = j
                println("${result[0]}, ${result[1]}")
                return result
            }
            j++
        }
    }
    println("Нет решения !!!")
    throw IllegalArgumentException()
}