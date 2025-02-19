package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var a = IntArray (0) {0}
    for (i in 0 until (numbers.size - 1)) {
        for (e in i+1 until numbers.size) {
            if (numbers[i] + numbers[e] == target) {
                a += i
                a += e
            }
        }
    }
    if (a.isEmpty()) {
        throw IllegalArgumentException("No results")
    }
    return a
}
