package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    TODO("Выполните задание")
}
fun main() {
    fun sumOfTwo(numbers: IntArray, target: Int): Int {
        val numbers = intArrayOf(2, 5, 3, 4, 20, 1)
        val target = 5
        for (i in numbers.indices)
            for (j in (i + 1) until numbers.size) {
                if (numbers[i] + numbers[j] == target) {
                    println("Индексы:[${i},[${j}]")
                }
            }
        throw IllegalArgumentException("Пары нет")
    }
}