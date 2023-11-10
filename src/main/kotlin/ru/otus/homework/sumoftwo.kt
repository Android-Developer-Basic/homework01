package ru.otus.homework

/* Функция `sumOfTwo` принимает массив целых чисел `numbers`, целое число `target`.

Реализуйте тело функции следующим образом чтобы она возвращала массив целых чисел, состоящий из индексов элементов массива numbers так, чтобы сумма значений чисел находящихся на этих индексах была равна числу target.

Если таких чисел нет, то выбросьте исключение `IllegalArgumentException` */

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int, Int>()
    for ((i,v) in numbers.withIndex()){
        map[v] = i
    }

    for ((i,v) in numbers.withIndex()){
        val delta = v - target;
        val temp = map[delta]
        if(temp != null && temp != i)return intArrayOf(temp, i)
    }

    throw IllegalArgumentException()
}