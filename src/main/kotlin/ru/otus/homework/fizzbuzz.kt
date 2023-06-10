package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {

    val intArray = IntArray(n)
    (0 until n).forEach { i -> intArray[i] = i }

    val stringArray = Array(size = n) { i ->
        when {
            intArray[i] == 0 ||
                    (intArray[i] % 3 == 0 && intArray[i] % 5 == 0) -> {
                "FizzBuzz"
            }

            intArray[i] % 3 == 0 -> {
                "Fizz"
            }

            intArray[i] % 5 == 0 -> {
                "Buzz"
            }

            else -> i.toString()
        }
    }
    return stringArray
}