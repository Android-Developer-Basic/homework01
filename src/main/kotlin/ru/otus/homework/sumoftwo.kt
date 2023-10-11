package ru.otus.homework

import kotlin.random.Random

/*
Функция `sumOfTwo` принимает массив целых чисел `numbers`, целое число `target`.
Реализуйте тело функции следующим образом чтобы она возвращала массив целых чисел, состоящий
из индексов элементов массива numbers так, чтобы сумма значений чисел находящихся на этих индексах
была равна числу target.
Если таких чисел нет, то выбросьте исключение `IllegalArgumentException`

Пример:
Input: numbers = [2,7,11,15], target = 9
Output: [0,1]

numbers[0](2) + numbers[1](7) == 9, result = [0,1]
 */

fun main(args: Array<String>) {
    val n: Int = 8
    val numbers: IntArray = IntArray(n);
//    val numbers: Array<Int> = Array(n) { 0 }
    for (i in 0..n - 1) {
        numbers[i] = Random.nextInt(1, 10)
    }
    println(numbers.contentToString())

    val target: Int = 9
    println(sumOfTwo(numbers, target).contentToString())

}

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val arr: IntArray = IntArray(2);//    Array<Int> = Array(2) { 0 }
    for (a in 0..numbers.size - 1) {
        for (b in 0..numbers.size - 1) {
            if (a != b && numbers[a] + numbers[b] == target) {
                arr[0] = a
                arr[1] = b
                return arr
            }
        }
    }
    throw IllegalArgumentException()

}