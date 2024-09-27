package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    if (n <= 0) {
        return emptyArray()
    }

    return Array(n){
        val divBy3 = it%3==0
        val divBy5 = it%5==0

        if (divBy3 && divBy5) "FizzBuzz"
        else if (divBy3) "Fizz"
        else if (divBy5) "Buzz"
        else it.toString()
    }
}