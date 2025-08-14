package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var result = IntArray(2) { 0 }
    val inputCnt = numbers.count()
    var isTarget = false

    for(  i in 0 .. inputCnt-2){
        for(  j in i+1 .. inputCnt-1){
            if (numbers[i] + numbers[j] == target) {
                result[0] = i
                result[1] = j
                isTarget = true
                break
            }
        }
        if( isTarget ) break
    }
    if( !isTarget ){
        throw IllegalArgumentException("Target not found")
    }

    return result
}