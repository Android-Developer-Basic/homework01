package ru.otus.homework


fun sumOfTwo (numbers: IntArray, target: Int) : IntArray {
    val result = IntArray(2)
    var count0 = 0
    var count1 = numbers.lastIndex

    if (numbers.size < 2) throw IllegalArgumentException("The array must contain at least two elements")

    else

        while (count0 < numbers.lastIndex){
            for (i in count0+1..numbers.lastIndex) {
                if (numbers[i] + numbers[count0] == target) {
                    result[0] = count0
                    result[1] = i
                    return result
                }
                else count1--
            }
            count0++
        }
    throw IllegalArgumentException("The array does not contain a pair of numbers corresponding to the target value")
}