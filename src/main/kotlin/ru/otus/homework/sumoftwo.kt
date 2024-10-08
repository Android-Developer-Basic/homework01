package ru.otus.homework

fun makeSortedNumbers(numbers: IntArray): Array<Pair<Int, Int>>{
    val orderedNumbers = Array(numbers.size) {Pair(0,0)}
    for((index, number) in numbers.withIndex()){
        orderedNumbers[index] = Pair(number, index)
    }
    orderedNumbers.sortWith { left, right ->
        when {
            left.first < right.first -> -1
            left.first > right.first -> 1
            else -> 0
        }
    }
    return orderedNumbers
}

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val orderedNumbers = makeSortedNumbers(numbers)

    var begin = 0
    var end = orderedNumbers.lastIndex

    while(begin != end) {
        val sum = orderedNumbers[begin].first + orderedNumbers[end].first
        if (sum == target)
            return intArrayOf(orderedNumbers[begin].second, orderedNumbers[end].second)
        if (sum < target)
            ++begin
        if (sum > target)
            --end
    }
    throw IllegalArgumentException()
}