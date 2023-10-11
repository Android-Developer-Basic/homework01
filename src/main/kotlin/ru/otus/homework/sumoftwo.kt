package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
/*    var found:Boolean=false;*/
    numbers.forEachIndexed() { j, _ ->
        var locSum:Int=0
        var outIdx=ArrayList<Int>()
        run breaking@ {
            numbers.drop(j).forEachIndexed() { i, v ->
                locSum += v
                if (locSum <= target) {
                    outIdx.add(i+j)
                    if (locSum == target) {
                        return outIdx.toIntArray()
                    }
                } else {
                    return@breaking
                }
            }
        }
    }
    throw IllegalArgumentException()
}