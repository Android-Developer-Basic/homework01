package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val result = mutableListOf<String>()
    for (i in 0..<n) {
        val divisibleBy3 = i % 3 == 0
        val divisibleBy5 = i % 5 == 0

        when {
            i ==0 || (divisibleBy3 && divisibleBy5) -> result.add("FizzBuzz")
            divisibleBy3 -> result.add("Fizz")
            divisibleBy5 -> result.add("Buzz")
            else -> result.add(i.toString())
        }
    }
    return result.toTypedArray()
}
