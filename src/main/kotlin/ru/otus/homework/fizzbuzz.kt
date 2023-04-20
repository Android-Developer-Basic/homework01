package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> = Array(n) { i ->
    if (i % 3 == 0 && i % 5 == 0) "FizzBuzz"
    else if(i % 3 == 0) "Fizz"
    else if(i % 5 == 0) "Buzz"
    else i.toString()
}