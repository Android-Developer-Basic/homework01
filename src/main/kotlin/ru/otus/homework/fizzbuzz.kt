package ru.otus.homework

/*
### Задача #1

Функция `fizzbuzz` принимает целое число `n` размер массива чисел, который заполняется от 0.
Реализуйте тело функции следующим образом:

1. Создается массив чисел от 0 размерностью n
2. Итерируемся по массиву чисел и заполняем выходной массив строк в зависимости от текущего числа:
    1. Если число кратно трем, то в массив добавляем строку `Fizz`
    2. Если число кратно пяти, то в массив добавляем строку `Buzz`
    3. Если число кратно и трем, и пяти, то в массив добавляем строку `FizzBuzz` (число 0 также
    должно добавлять строку `FizzBuzz`)
    4. Если число не кратно ни одному их этих чисел, то в массив нужно положить просто само число
    приведенное к строке

Пример:
Input: n = 5
Output: ["FizzBuzz", "1", "2", "Fizz", "4"]

0 - FizzBuzz
1 - не кратно 3 и 5
2 - не кратно 3 и 5
3 - кратно 5
4 - не кратно 3 и 5
 */

fun main(args: Array<String>) {
    val n: Int = 8
    println("Input: n = $n")

    fizzbuzz(n)
}

fun fizzbuzz(n: Int): Array<String> {

    val myArrayInt: Array<Int> = Array(n) { 0 }
    val myArrayString: Array<String> = Array(n) { "" }

    print("Source array: ")
    for (i in 0..n-1) {
        myArrayInt[i] = i
    }
    println(myArrayInt.contentToString())
    println()

    var i: Int = 0
    for (arg in myArrayInt) {
        if (arg % 3 == 0 && arg % 5 == 0) {
            myArrayString[i] = "FizzBuzz"
        } else {
            if (arg % 3 == 0) {
                myArrayString[i] = "Fizz"
            } else {
                if (arg % 5 == 0) {
                    myArrayString[i] = "Buzz"
                } else {
                    myArrayString[i] = myArrayInt[i].toString()
                }
            }
        }
        i += 1
    }

    println("Output: ")
    println(myArrayString.contentToString())

    return myArrayString
}