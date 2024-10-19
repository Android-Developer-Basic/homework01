package ru.otus.homework

fun main() {
    val inpN = 6
    val resultTextArray = fizzbuzz(inpN)
    println(resultTextArray.contentToString())
}

fun fizzbuzz(n: Int): Array<String> {
    var i = 0
    val numbArray = Array(n) { i++ }
    val textArray = Array(n) { "textString" }

    for(index in numbArray.indices) {
        val number = numbArray[index]

        if(number % 3 == 0 && number % 5 == 0) {
            textArray[index] = "FizzBuzz"
        } else if(number % 3 == 0) {
            textArray[index] = "Fizz"
        } else {
            if (number % 5 == 0) {
                textArray[index] = "Buzz"
            } else {
                textArray[index] = number.toString()
            }
        }
    }

    return textArray
}