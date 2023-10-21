package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    if (numbers.size==0) throw IllegalArgumentException()

    for (f in 0..numbers.size-1) {
        for(k in f+1..numbers.size-1) {
            if (numbers[f]+numbers[k] == target) {
                return intArrayOf(f,k)
            }
        }
    }

    throw IllegalArgumentException()
}