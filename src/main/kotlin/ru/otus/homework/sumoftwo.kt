package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    if (numbers.size < 2)
        throw IllegalArgumentException()
    val output = ArrayList<Int>()
    for (externalLoop in numbers.indices) { // from i to size, where i = 0...n
        var internalLoop = externalLoop + 1
        while (internalLoop < numbers.size) {   // from j to size. where j = (i+1)...n
            if (numbers[externalLoop] + numbers[internalLoop] == target) {
                output.add(externalLoop)
                output.add(internalLoop)
            }
            ++internalLoop
        }
    }
    if (output.isEmpty()) {
        throw IllegalArgumentException()
    } else
        return output.toIntArray()
}
