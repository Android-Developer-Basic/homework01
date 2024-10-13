package ru.otus.homework

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    for (i in numbers.indices){
        for (j in i+1 ..<numbers.size){
            val firstNum = numbers[i]
            val secondNum = numbers[j]
            if (firstNum + secondNum == target){
                val resultArray = intArrayOf(i,j)
                return resultArray
            }
        }
    }

    throw IllegalArgumentException()
}