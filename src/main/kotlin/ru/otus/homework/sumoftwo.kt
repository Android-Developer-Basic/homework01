package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    if(numbers.isEmpty()){
        return IntArray(size = 0)
    }

    for(i in 1..numbers.size){
        val indexes: IntArray = IntArray(size = i){it}

        do{
            // calculate sum of current elements
            var sum: Int = 0
            for(j in indexes){
                sum += numbers[j]
            }

            // if sum equal target then return array of indexes
            if(sum == target){
                return indexes
            }

            var endOfCycle: Boolean = true
            // check if we can create new combination of the indexes
            findIndexLoop@ for(index in indexes.lastIndex downTo 0){
                if(indexes[index] < numbers.lastIndex - (indexes.lastIndex - index)){
                    // index not in the end
                    // create new combination - move this index one step right
                    // follow indexes set right behind it
                    indexes[index] ++;
                    for(k in index + 1 .. indexes.lastIndex){
                        indexes[k] = indexes[k-1] + 1
                        endOfCycle = false
                        break@findIndexLoop
                    }
                }
            }
        }while(!endOfCycle)
    }

    throw IllegalArgumentException("Target is impossible")
}