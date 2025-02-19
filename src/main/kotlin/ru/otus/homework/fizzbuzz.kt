package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {

    val ints = Array(n) { i -> (i) }
    val strings = Array(n) { "" }

    for (i in 0 until n) {
        if (i == 0) {
            strings[i] = "FizzBuzz"
        }
        else if ((ints[i] % 3 == 0) and (ints[i] % 5 == 0)){
            strings[i] = "FizzBuzz"
        }
        else if (ints[i] % 3 == 0) {
            strings[i] = "Fizz"
        }
        else if (ints[i] % 5 == 0) {
            strings[i] = "Buzz"
        }
        else {
            strings[i] = "$i"
        }
    }

    return strings
}