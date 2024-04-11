package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val result: Array<String> = Array(n) { i -> i.toString() }
    for(i: Int in result.indices)  {
        if (i%3==0 && i%5==0) {
            result[i]="FizzBuzz"
        } else if (i%3==0) {
            result[i]="Fizz"
        } else if (i%5==0) {
            result[i]="Buzz"
        }
    }
    return result
}
