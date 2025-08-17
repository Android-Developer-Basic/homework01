package ru.otus.homework

import kotlin.random.Random


fun fizzbuzz(n: Int): Array<String> {

    val names = arrayOf("Fizz", "Buzz")
    val numbers = arrayOfNulls<Int>(n)
    val result = arrayOfNulls<String>(n)

    numbers[0] = 0
    for( i in 1..n-1) {
        numbers[i] = Random.nextInt(0, 25)
    }
    for( i in 0..n-1) {
        result[i] = when{
            numbers[i] == 0         -> names[0]+names[1]
            numbers[i]?.rem(3) ==0 && numbers[i]?.rem(5) ==0 -> names[0]+names[1]
            numbers[i]?.rem(3) == 0 -> names[0]
            numbers[i]?.rem(5) == 0 -> names[1]
            else -> numbers[i].toString()
        }
    }
    return result as Array<String>
}
