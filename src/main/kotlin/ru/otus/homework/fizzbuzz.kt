package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    if(n == 0) {
        val symbols = emptyArray<String>()
        println("Размерность создаваемого массива равна 0")
        return symbols
    }

    var i: Int = 0
    val numbers: Array<Int> = Array(n, { i++ })
    for (j in 0..n - 1) {
        print("${numbers[j]} \t")
    }
    println()
    i = 0
    val symbols: Array<String> = Array(n, {""})

    for (j in 0..n - 1) {
        if (numbers[j] % 3 == 0 && numbers[j] % 5 == 0) {
            symbols[j] = "FizzBuzz"
        } else if (numbers[j] % 3 == 0) symbols[j] = "Fizz"
        else if (numbers[j] % 5 == 0) symbols[j] = "Buzz"
        else symbols[j] = j.toString()
    }
    println()
    for (j in 0..n - 1) {
        print("${symbols[j]} \t")
    }
    return symbols
}