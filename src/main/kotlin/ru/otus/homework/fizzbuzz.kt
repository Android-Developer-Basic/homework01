package ru.otus.homework

import java.util.*
/*
Функция `fizzbuzz` принимает целое число `n` размер массива чисел, который заполняется от 0. Реализуйте тело функции следующим образом:

1. Создается массив чисел от 0 размерностью n
2. Итерируемся по массиву чисел и заполняем выходной массив строк в зависимости от текущего числа:
1. Если число кратно трем, то в массив добавляем строку `Fizz`
2. Если число кратно пяти, то в массив добавляем строку `Buzz`
3. Если число кратно и трем, и пяти, то в массив добавляем строку `FizzBuzz` (число 0 также должно добавлять строку `FizzBuzz`)
4. Если число не кратно ни одному их этих чисел, то в массив нужно положить просто само число приведенное к строке
*/

fun checkValue(i: Int): String{
    if(i%3 == 0){
        if(i%5 == 0)return "FizzBuzz"
        else return "Fizz"
    }
    if(i%5 == 0) return "Buzz"
    return i.toString()
}
fun fizzbuzz(n: Int): Array<String> {
    val random = Random()
    val arr = Array<Int>(n){ random.nextInt(n) }
    val result:Array<String> = Array<String>(n, {""})

    for (index in 0 until arr.size){
        result.set(index, checkValue(arr[index]))
    }

    return result
}