package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
     var i: Int = 0
     val numbers: Array<Int> = Array(n, { i++ })
//     val numbers = arrayOf(n, {i++})
    for (j in 0..n - 1) {
        print("${numbers[j]} \t")
    }
    println()
    i = 0
    val symbols: Array<String> = Array(n, { i++.toString() })
    for (j in 0..n - 1) {
        print("${symbols[j]} \t")
    }
    for (j in 0..n - 1) {
        if (numbers[j] % 3 == 0 && numbers[j] % 5 == 0) {
            symbols[j] = "FizzBuzz"
        } else if (numbers[j] % 3 == 0) symbols[j] = "Fizz"
        else if (numbers[j] % 5 == 0) symbols[j] = "Buzz"
    }
    println()
    for (j in 0..n - 1) {
        print("${symbols[j]} \t")
    }
     return symbols

}