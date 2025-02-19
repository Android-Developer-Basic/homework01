package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int,first: Boolean =true): IntArray {

    var result: ArrayList<Int> = ArrayList<Int>()
    for (ii in 0..<numbers.size) {
        result = ArrayList<Int>()
        if (numbers[ii] > target) {
            continue
        }
        result.add(ii)
        if (numbers[ii] == target) {
            break
        }
        val innerResult =
            sumOfTwo(
                numbers.copyOfRange(ii + 1, numbers.size),
                target - numbers[ii],
                false
            ).asList()
        if (innerResult.size > 0) {
            for (elem in innerResult) {
                result.add(elem + ii + 1)
            }
            break
        }

    }

    var sum=0
    for (index in result){
        sum += numbers[index]
    }
    if (first && sum!=target) {
        throw IllegalArgumentException()
    }else{
        return result.toIntArray()
    }
}