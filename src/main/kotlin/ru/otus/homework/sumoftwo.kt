package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var i: Int
    var j: Int
    var result = intArrayOf(0, 0)
    var bFound = false

    loop@for(i in 0..numbers.size - 2)
    {
        for(j in i+1..numbers.size - 1)
        {
            if( (numbers[i] + numbers[j]) == target )
            {
                result[0] = i
                result[1] = j
                bFound = true
                break@loop
            }
        }
    }

    if(!bFound)
        throw IllegalArgumentException()

    return result
}