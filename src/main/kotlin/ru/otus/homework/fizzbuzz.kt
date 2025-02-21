package ru.otus.homework

fun fizzbuzz(n: Int): Array<String>{
    val array = Array(n){it}
    val expectedArray = Array(n){""}
    for (i in array) {
        if (i%3==0) {
            expectedArray[i] += "Fizz"
        }
        if (i%5==0) {
            expectedArray[i] += "Buzz"
        }
        if (expectedArray[i] == "") {
            expectedArray[i] = i.toString()
        }
    }
    return expectedArray
}