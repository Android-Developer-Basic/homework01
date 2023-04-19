package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val arrIndexes = IntArray(2)
    var sum: Int

    if (numbers.size < 2) throw IllegalArgumentException()

    for ((k, value) in numbers.withIndex()) {
        for ((i, value) in numbers.withIndex()) {
            if (k == i) {
                continue
            } else {
                sum = numbers[k] + numbers[i]

                if (sum == target) {
                    arrIndexes[0] = i
                    arrIndexes[1] = k
                }
            }
        }
    }

    if (arrIndexes[0] == 0 && arrIndexes[1] == 0) throw IllegalArgumentException()

    return arrIndexes
}
