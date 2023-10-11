package ru.otus.homework

fun fizzbuzz(n: Int): Array<String> {
    if(n <= 0) return emptyArray<String>()

    val fizzBuzzArray = Array(size = n) {""}

    for(i in 0 until n){
        fizzBuzzArray[i] = nameFizzBuzz(i)
    }

    return fizzBuzzArray
}

fun nameFizzBuzz(i: Int): String{
    when {
        (i == 0) -> return "FizzBuzz"
        (i % 3 == 0 && i % 5 == 0) -> return "FizzBuzz"
        (i % 3 == 0) -> return "Fizz"
        (i % 5 == 0) -> return "Buzz"
    }

    return i.toString()
}