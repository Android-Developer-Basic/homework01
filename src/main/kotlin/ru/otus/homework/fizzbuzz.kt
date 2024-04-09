package ru.otus.homework
//import Array

fun fizzbuzz(n: Int): Array<String> {
    var myArray = emptyArray<String>()
    if(n > 0) {
        myArray = Array(n) { i -> i.toString() }
        for (i in 0 until n) {
            if (i == 0 || (i % 3 == 0 && i % 5 == 0)) {
                myArray[i] = "FizzBuzz"
            } else if (i % 3 == 0) {
                myArray[i] = "Fizz"
            } else if (i % 5 == 0) {
                myArray[i] = "Buzz"
            } else {
                i.toString()
            }
        }

    }
    return myArray
}
