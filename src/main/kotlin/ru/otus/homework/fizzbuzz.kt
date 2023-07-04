package ru.otus.homework


fun fizzbuzz(n: Int): Array<String?> {
    val stringArray = arrayOfNulls<String>(n)
    val intArray = IntArray(n)

    (0 until n).forEach { i ->
        intArray[i] = i
    }
    if (n > 0) {
        for (i in intArray) {
            if ((intArray[i] % 5) == 0 && (intArray[i] % 3) == 0) {
                stringArray[i] = "FizzBuzz"
            } else if ((intArray[i] % 3) == 0 && intArray[i] != 0) {
                stringArray[i] = "Fizz"
            } else if ((intArray[i] % 5) == 0 && intArray[i] != 0) {
                stringArray[i] = "Buzz"
            } else stringArray[i] = intArray[i].toString()
        }
    }
    return stringArray
}