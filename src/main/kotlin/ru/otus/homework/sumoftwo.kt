package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val array = IntArray(2) {0}
    for(i in 0 until numbers.size){
        if(i != numbers.size - 1){
            if(numbers[i] + numbers[i + 1] == target){
                array[0] = i
                array[1] = i + 1
                break
            }
        }
    }
    return if(array[1] == 0) throw IllegalArgumentException() else array
}