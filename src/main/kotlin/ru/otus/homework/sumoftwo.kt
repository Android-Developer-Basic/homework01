package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var outBuffer = emptyArray<Int>()
    var counter = 0
    numbers.forEachIndexed { index, element ->
        if(numbers.contains(target - element)){
            if(!outBuffer.contains(index) and ((target - element) != element)){
                outBuffer += index
                counter++
            }
        }

    }
    if(counter == 0) throw IllegalArgumentException("Отсутствуют нужные числа!")
    return outBuffer.toIntArray()
}