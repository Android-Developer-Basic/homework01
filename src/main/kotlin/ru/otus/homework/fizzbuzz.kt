package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    if(n <= 0){
        return emptyArray<String>()
    }

    val tempArray: Array<Int> =  Array<Int>(size = n) { it }

    val resArray: Array<String> = Array<String>(size = n){""}

    for(i in tempArray){
        resArray[i] = when{
            (i % 15 == 0) -> "FizzBuzz"
            (i % 3 == 0) -> "Fizz"
            (i % 5 == 0) -> "Buzz"
            else -> i.toString()
        }
    }

    return resArray
}