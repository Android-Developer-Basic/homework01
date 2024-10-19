package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var result: IntArray? = null
    for( i in numbers.indices ){
        for( b in i + 1..<numbers.size){
            if(numbers[i] + numbers[b] == target)
            {
                result = IntArray(2)
                result[0] = i
                result[1] = b
            }
        }
    }
    return result?: throw IllegalArgumentException("Not found")
}