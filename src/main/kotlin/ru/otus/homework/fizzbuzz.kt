package ru.otus.homework

import kotlin.random.Random


fun fizzbuzz(n: Int): Array<String> {
    val intArr = mutableListOf<Int>()
    val stringArr = mutableListOf<String>()

    while (intArr.size < n) {
        val randomNumber = Random.nextInt(0, 101)
        intArr.add(randomNumber)
    }

    intArr.forEach { item ->
        when {
            item == 0 -> stringArr.add("FizzBuzz")
            item % 3 == 0 && item % 5 == 0 -> stringArr.add("FizzBuzz")
            item % 3 == 0 -> stringArr.add("Fizz")
            item % 5 == 0 -> stringArr.add("")
            else -> stringArr.add(item.toString())
        }
    }

    return stringArr.toTypedArray()
}