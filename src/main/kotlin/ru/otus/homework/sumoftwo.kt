package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val numbers = intArrayOf(2,7,12,15)
    val target = 9
    val result = sumOfTwo(numbers, target)
    println("Индексы: [${numbers}, ${target}]")
    for (i in numbers.indices) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] + numbers[j] == target)
                return intArrayOf(i, j)
        }
    }
    throw IllegalArgumentException("Пары нет")
}
