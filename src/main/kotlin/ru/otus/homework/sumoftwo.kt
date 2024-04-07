package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var list = mutableListOf<Int>()
    var sum = 0
    //var good = 0
    for (i in 0 until numbers.size) {
        sum = numbers[i]
        for (j in i + 1 until numbers.size) // i = 1
        {
            if (sum + numbers[j] == target)
            {
                list.add(i)
                list.add(j)
            }
        }
    }
    if(list.isEmpty())
        throw IllegalArgumentException("Shit happens")

    return list.toIntArray()
}

