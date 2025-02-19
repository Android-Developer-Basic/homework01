package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val a = Array (n) {""}
    for (i in 0.. n-1){
        if (i % 3 == 0 && i % 5==0) {
            a[i] = "FizzBuzz"
        } else if (i % 3 == 0) {
            a[i] = "Fizz"
        } else if (i % 5 == 0) {
            a[i] = "Buzz"
        } else {
            a[i] = "$i"
        }
    }
    return a
}
