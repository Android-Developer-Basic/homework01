package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    for (i in 0  until numbers.size -1){
        val current = numbers[i]
        val next = numbers[i+1]

        if(current + next == target){
            return  intArrayOf(i,i+1)
        }
    }

    throw IllegalArgumentException("Нет такого сочетания")

}


