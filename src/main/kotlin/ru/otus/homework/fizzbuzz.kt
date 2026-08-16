package ru.otus.homework

const val fizzStr =  "Fizz"
const val buzzStr =  "Buzz"

/**
 * Строит массив из [n] строк по числам от 0 до n - 1:
 * кратные трём дают `Fizz`, кратные пяти - `Buzz`, кратные и трём, и пяти (в том числе 0) - `FizzBuzz`,
 * остальные — само число в виде строки.
 */
fun fizzbuzz(n: Int): Array<String> {
    val indices = (0 until n).toList().toIntArray()
    val resultList = mutableListOf<String>()

    for (i in indices) {
        // Признаки накапливаем конкатенацией: если число кратно и 3, и 5,
        // обе ветки сработают и сами дадут "FizzBuzz"
        var resultValue = ""
        if (isFizz(i)) resultValue += fizzStr
        if (isBuzz(i)) resultValue += buzzStr
        // Строка осталась пустой — значит, ни одно из делений не подошло.
        if (resultValue.isEmpty()) resultValue = i.toString()

        resultList.add(resultValue)
    }

    return resultList.toTypedArray()
}

/** Проверяет, делится ли [a] на [b] без остатка. */
fun isNumberMultipleOf(a: Int, b: Int): Boolean {
    return a % b == 0
}

fun isFizz(a: Int): Boolean = isNumberMultipleOf(a, 3)
fun isBuzz(a: Int): Boolean = isNumberMultipleOf(a, 5)
