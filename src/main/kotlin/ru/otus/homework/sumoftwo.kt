package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    val n:Int = numbers.size
    var i: Int
    var j: Int
    var flag: Boolean = false

    val arr=IntArray(2)

    i=0
    while (i < n-1)  {
        j=n-1
        while ( j > i)  {

            if ( numbers[i] + numbers[j] == target ) {

                arr[0]=i
                arr[1]=j
                flag = true
            }
            j--
        }

        i++
    } //while (i < n-2)..

    if (flag) {

        return arr
    } else {

        throw IllegalArgumentException("нет таких чисел")
    }



}