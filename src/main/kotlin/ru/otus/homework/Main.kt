package ru.otus.homework

fun main() {
    val strings: Array<String> = fizzbuzz(16)

    for(string in strings){
        print("$string , ")
    }


    println("")
    val intArray: IntArray = sumOfTwo(intArrayOf(2, 7, 11, 15), 9)
    for(int in intArray){
        print("$int , ")
    }

}