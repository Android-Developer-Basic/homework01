package ru.otus.homework



fun fizzbuzz(n: Int): Array<String> {
    val array = Array<Any>(n) {0 until n}
    for(i in 0 until n) {
        if(i % 3 == 0 && i % 5 == 0){
            array[i] = "FizzBuzz"
        } else if(i % 5 == 0){
            array[i] = "Buzz"
        } else if(i % 3 == 0){
            array[i] = "Fizz"
        } else {
            array[i] = i
        }
    }
    return array.map { it.toString() }.toTypedArray()
}