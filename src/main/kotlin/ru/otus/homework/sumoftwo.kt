package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var resArr = intArrayOf(-1, -1)

    indicesLoop@ for( i in numbers.indices ) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] + numbers[j] == target) {
                resArr[0] = i
                resArr[1] = j
                break@indicesLoop
            }
        }
    }
    if( resArr[0] == -1 && resArr[1] == -1 ){
        throw IllegalArgumentException("Not found")
    }

    return resArr
}