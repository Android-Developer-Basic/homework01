package ru.otus.homework

import com.sun.jdi.event.ExceptionEvent


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var result: IntArray = intArrayOf(0,0)

    for(i in 0 .. numbers.size-2) {
        for(j in i+1 .. numbers.size-1) {
            if (numbers.get(i) + numbers.get(j) == target) {
                result.set(0, i)
                result.set(1, j)
                return result
            }
        }
    }

    throw IllegalArgumentException("Not found combination")
}