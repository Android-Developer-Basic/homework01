package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {

    val intArray = IntArray(n)
    (0 until n).forEach { i -> intArray[i] = i }

    val stringArray = Array(size = n) {""}

    intArray.forEach { i ->
        when {
            i == 0 || (i % 3 == 0 && i % 5 == 0)  -> {
                stringArray[i] = "FizzBuzz"
            }
            i % 3 == 0 -> {
                stringArray[i] = "Fizz"
            }
            i % 5 == 0 -> {
                stringArray[i] = "Buzz"
            }
            else -> stringArray[i] = i.toString()
        }
    }
   return stringArray
}