package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for (i in 0..<numbers.size) {

        for (j in 0..<numbers.size) {

            if (i == j) {
                continue
            }

            if (numbers[i] + numbers[j] == target) {
                val arr = IntArray(2)
                arr[0] = i
                arr[1] = j
                return arr
            }
        }
    }

    throw IllegalArgumentException("no such numbers")
}