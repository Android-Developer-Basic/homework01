package ru.otus.homework

fun main() {
    println("Метод fizzbuzz")
    val size = 5
    val fizzResult = fizzbuzz(size)
    println("Input: n = $size")
    println("Output: [${fizzResult.joinToString()}]")
    for (i in fizzResult.indices) {
        val value = fizzResult[i]
        val description = when {
            i == 0 -> "FizzBuzz"
            value == "FizzBuzz" -> "кратно 3 и 5"
            value == "Fizz" -> "кратно 3"
            value == "Buzz" -> "кратно 5"
            else -> "не кратно 3 и 5"
        }

        println("$i - $description")
    }
    println()
    println("Метод sumOfTwo")
    val numbers = intArrayOf(2, 11, 7, 15)
    val target = 9
    val sumResult = sumOfTwo(numbers, target)

    println("Input: numbers = [${numbers.joinToString()}], target = $target")
    println("Output: ${sumResult.joinToString()}")
    println(
        "numbers[${sumResult[0]}](${numbers[sumResult[0]]}) + " +
                "numbers[${sumResult[1]}](${numbers[sumResult[1]]}) == $target, " +
                "result = [${sumResult.joinToString()}]"
    )
}