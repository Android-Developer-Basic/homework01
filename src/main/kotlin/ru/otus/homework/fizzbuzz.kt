package ru.otus.homework

fun main() {
    println("Введите количество элементов массива от 1 до 2147483647 ")
    val n = readln()
    fizzbuzz(n.toInt())
}
fun fizzbuzz(n: Int): Array<String> {
    var a: Int
    var b: Int
    val IntArr = IntArray(size = n)
    val StrArr = Array<String>(n) { "" }
    for (i in 0 until n) {
        IntArr[i] = i
        a = div3(i)
        b = div5(i)
        StrArr[i] = IntArr[i].toString()
        if (IntArr[i] == 0) {
            StrArr[i] = "FizzBuzz"
        }
        if (a == 0 && b == 0) {
            StrArr[i] = "FizzBuzz"
        }
        if (a == 0 && b != 0) {
            StrArr[i] = "Fizz"
        }
        if (a != 0 && b == 0) {
            StrArr[i] = "Buzz"
        }
        print(StrArr[i]); print(" ")
    }
    return StrArr
}

fun div3(a:Int):Int{
    val b = a/3
    return a - 3*b
}
fun div5(a:Int):Int {
    val b = a/5
    return a - 5*b
}
