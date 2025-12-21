package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val n = numbers.size
    for (i in 0..n-1){
        for ( j in i+1..n-1){
            if( numbers[i] + numbers[j] == target)
                return intArrayOf(i, j)
        }
    }
    throw IllegalArgumentException()
}
