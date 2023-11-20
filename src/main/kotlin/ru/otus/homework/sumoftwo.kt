package ru.otus.homework

import java.lang.IllegalArgumentException

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val listInt: IntArray = intArrayOf(
        0,
        0
    )
    for(i in numbers.indices)
    {
        if (i < numbers.size - 1)
        {
            for(j in i + 1 until numbers.size)
            {
                if (numbers[i] + numbers[j] == target)
                {
                    listInt[0] = i
                    listInt[1] = j
                    return listInt
                }
            }
        }
    }
    throw IllegalArgumentException()
}