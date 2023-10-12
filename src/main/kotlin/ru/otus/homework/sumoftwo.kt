package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    var aUsed=BooleanArray(numbers.count()) {_->false}

    fun helper(from: Int, cSum : Int):Int {
        var lSum = cSum
        for (i in from .. numbers.count()-1) {
            if ( !aUsed[i] ) {
                lSum+=numbers[i]
                aUsed[i]=true
                if (lSum == target) {
                    return lSum
                } else if (lSum < target) {
                    if (helper(i+1,lSum) == target) {
                        return target
                    }
                }
                lSum-=numbers[i]
                aUsed[i]=false
            }
        }
        return cSum
    }

    numbers.forEachIndexed() { j, _ ->
        if (helper(j,0) == target) {
            var aOut=ArrayList<Int>()
            aUsed.forEachIndexed() {k,used ->
                if (used) {
                    aOut.add(k)
                }
            }
            return aOut.toIntArray()
        }
    }
    throw IllegalArgumentException()
}