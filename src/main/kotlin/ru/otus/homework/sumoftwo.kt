package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for ((idx, n) in numbers.withIndex()){
        for ((idx2, l) in numbers.withIndex()) {
            if (idx2 <= idx) continue
            if (n + l == target) return intArrayOf(idx, idx2)
        }
    }
    throw IllegalArgumentException("Таких чисел нет")
}
