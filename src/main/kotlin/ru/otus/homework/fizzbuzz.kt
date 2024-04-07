package ru.otus.homework

/**
 *Задача #1
 * Функция `fizzbuzz` принимает целое число `n` размер массива чисел, который заполняется от 0. Реализуйте тело функции следующим образом:
 *
 * 1. Создается массив чисел от 0 размерностью n
 * 2. Итерируемся по массиву чисел и заполняем выходной массив строк в зависимости от текущего числа:
 *     1. Если число кратно трем, то в массив добавляем строку`Fizz`
 *     2. Если число кратно пяти, то в массив добавляем строку`Buzz`
 *     3. Если число кратно и трем, и пяти, то в массив добавляем строку`FizzBuzz` (число 0 также должно добавлять строку `FizzBuzz`)
 *     4. Если число не кратно ни одному их этих чисел, то в массив нужно положить просто само число приведенное к строке
 */

fun fizzbuzz(n: Int): Array<String> {
    val fizzbuzzinarray = Array(size = n) {i: Int -> i}
    var fizzbuzzoutarray = arrayOf<String>()

    for (item : Int in fizzbuzzinarray) {
        val value = when {
            item % 3 == 0 && item % 5 == 0 -> "FizzBuzz"
            item % 3 == 0 -> "Fizz"
            item % 5 == 0 -> "Buzz"
            else -> item.toString()
        }
        fizzbuzzoutarray +=value
    }
    return fizzbuzzoutarray
}