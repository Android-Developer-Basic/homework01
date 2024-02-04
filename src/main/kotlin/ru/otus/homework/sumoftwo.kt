package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var arr = intArrayOf()
    for(i in 0 .. numbers.size-1){
        for(y in 0 .. numbers.size-1) {
            if(i!=y &&  (numbers[i] + numbers[y] == target) && (!arr.contains(i) && !arr.contains(y)))
                arr += intArrayOf(i, y)
        }
    }
    if (arr.size == 0)
        throw IllegalArgumentException("В данном массиве нет таких чисел")
    return arr
}