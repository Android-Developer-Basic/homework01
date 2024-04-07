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
    val FizzbuzzInArray = Array(size = n) {i: Int -> i}
    var FizzbuzzOutArray = arrayOf<String>()

    for (item : Int in FizzbuzzInArray) {
        if ((item % 3 == 0 && item % 5 == 0 ) || item == 0) {
            FizzbuzzOutArray += "FizzBuzz"
        } else if (item % 3 == 0) {
            FizzbuzzOutArray += "Fizz"
        } else if (item % 5 == 0) {
            FizzbuzzOutArray += "Buzz"
        } else {
            FizzbuzzOutArray += item.toString()
        }
    }
    return FizzbuzzOutArray
}