package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    var intArr = IntArray(0){0}

    for (i in 0 until (numbers.size - 1)){
        for(j in (i + 1) until numbers.size){
            if (numbers[i] + numbers[j] == target){
                intArr += i
                intArr += j
            }
        }
    }

    if (intArr.isEmpty()) {
        throw IllegalArgumentException("No result")
    }
    return intArr
}