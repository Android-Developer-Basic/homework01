package ru.otus.homework

import kotlin.random.Random


fun main() {
    val array = fizzbuzz(5)
}



fun fizzbuzz(x: Int): IntArray {
    val array = IntArray(x)
    var arr = emptyArray<String>()
    var stroka: String = ""

    for (i in 0 until array.size) {
        array[i] = Random.nextInt(0, 100)
        stroka = ""
        if (array[i] % 3 == 0){
            stroka += "Fizz"
        }
        if (array[i] % 5 == 0){
            stroka += "Buzz"
        }
        if ((array[i] % 3 != 0) and (array[i] % 5 != 0)){
            stroka += array[i].toString()
        }
        println(array[i])
        arr += stroka
        println(arr[i])
    }

    return array

}