package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    var arrayInt = arrayOf<Int>()
    var arrayString = arrayOf<String>()

    for (i in 0 until n) {
        arrayInt += i
    }

    for (i in arrayInt) {
        arrayString += if (i % 3 == 0 && i % 5 == 0) {
            "FizzBuzz"
        } else if (i % 3 == 0) { //Если число кратно трем, то в массив добавляем строку Fizz
            "Fizz"
        } else if (i % 5 == 0) { //Если число кратно пяти, то в массив добавляем строку Buzz
            "Buzz"
        } else {
            "$i"
        }
    }
    println(arrayString.contentToString())
    return arrayString
}