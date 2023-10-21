package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    if(n == 0) { // т.к. n : Int, а не Int?, т.е. не nullable
        return emptyArray()
    }
    var result = Array(n,{""})
    for (i in 0..n-1) {
        result[i] =
        when (0) {
            i, i % 3 + i % 5 -> "FizzBuzz"
            i % 3 -> "Fizz"
            i % 5 -> "Buzz"
            else -> "$i"
        }
    }

    return result
}