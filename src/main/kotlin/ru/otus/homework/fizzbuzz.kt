package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val arrayStrings = Array(n){""}
    val arrayInt = createAndFillArray(n)
    return if (n == 0) {
        arrayStrings
    } else {
        for ((iteration, int) in arrayInt.withIndex()) {
            if (int % 3 == 0 && int % 5 == 0 || int == 0) arrayStrings[iteration] = "FizzBuzz"
            else if (int % 3 == 0) arrayStrings[iteration] = "Fizz"
            else if (int % 5 == 0) arrayStrings[iteration] = "Buzz"
            else arrayStrings[iteration] = int.toString()
        }
        arrayStrings
    }
}
fun createAndFillArray(size : Int): IntArray {
    var arrayWithIntegers = intArrayOf()
    for (i in IntRange(0, size - 1) step 1) arrayWithIntegers += i
    return arrayWithIntegers
}
