package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {

    var intArr = arrayOf<Int>()
    var stringArr = arrayOf<String>()

    for (i in 0 until n) intArr += i
    for (i in intArr) {
        stringArr += if(i % 3 == 0 && i % 5 == 0) {
            "FizzBuzz"
        } else if(i % 3 == 0) {
            "Fizz"
        } else if(i % 5 == 0) {
            "Buzz"
        } else "$i"
    }
    return stringArr
}