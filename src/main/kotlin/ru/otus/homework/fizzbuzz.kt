package ru.otus.homework


fun fizzbuzz(n: Int): Array<String?> {
    val stringArray = arrayOfNulls<String>(n)
    val intArray = IntArray(n)

    (0 until n).forEach { i ->
        intArray[i] = i
    }
    for (i in intArray) {
        var currentNumber = intArray[i]
        if ((currentNumber % 5) == 0 && (currentNumber % 3) == 0) {
            stringArray[i] = "FizzBuzz"
        } else if ((currentNumber % 3) == 0) {
            stringArray[i] = "Fizz"
        } else if ((currentNumber % 5) == 0) {
            stringArray[i] = "Buzz"
        } else stringArray[i] = currentNumber.toString()
    }

    return stringArray
}