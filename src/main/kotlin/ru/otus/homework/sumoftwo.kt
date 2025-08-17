package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val inputCnt = numbers.count()

    for(  i in 0 .. inputCnt-2){
        for(  j in i+1 .. inputCnt-1){
            if (numbers[i] + numbers[j] == target) {
                return intArrayOf( i, j )
            }
        }
    }
    throw IllegalArgumentException("Target not found")
}