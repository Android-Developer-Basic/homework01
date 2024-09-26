package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    if (n <= 0) {
        return emptyArray()
    }

    val fizBuzzArr = Array(n){""}

    for (i in  0..<n) {
        val divBy3 = i%3==0
        val divBy5 = i%5==0

        fizBuzzArr[i] = if (divBy3 && divBy5) "FizzBuzz"
        else if (divBy3) "Fizz"
        else if (divBy5) "Buzz"
        else i.toString()
    }

    return fizBuzzArr
}