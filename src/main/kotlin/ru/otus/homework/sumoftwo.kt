package ru.otus.homework

/**
 * Функция `sumOfTwo` принимает массив целых чисел `numbers`, целое число `target`.
 * Реализуйте тело функции следующим образом чтобы она возвращала массив целых чисел, состоящий из индексов элементов массива numbers так, чтобы сумма значений чисел находящихся на этих индексах была равна числу target.
 * Если таких чисел нет, то выбросьте исключение `IllegalArgumentException`
 */

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    val sumOfTwoOut: ArrayList<Int> = ArrayList()

    for (i in numbers.indices) {
        for (j in i + 1 until numbers.size) {

            if (numbers[i] + numbers[j] == target) {
                sumOfTwoOut.add(i)
                sumOfTwoOut.add(j)
                break
            }
        }
    }
    if (sumOfTwoOut.isEmpty()) {
        throw IllegalArgumentException("NotFound")
    }
    return sumOfTwoOut.toIntArray()
}