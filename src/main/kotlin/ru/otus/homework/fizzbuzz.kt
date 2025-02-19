package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    var array = Array<String>(n) { "" }
    for(i in array.indices) {
       if (i % 3 == 0 && i % 5 == 0) {
           array[i] = "FizzBuzz"
       } else if (i % 3 == 0) {
           array[i] = "Fizz"
       } else if (i % 5 == 0) {
           array[i] = "Buzz"
       } else {
           array[i] = i.toString()
       }
    }
    return array
}