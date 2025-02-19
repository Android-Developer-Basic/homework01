package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val arr: Array<Int> = Array(n) { it }
    val ret: Array<String> = Array(n) {
        when {
            arr[it] % 3 == 0 && arr[it] % 5 == 0 || arr[it] == 0 -> "FizzBuzz"
            arr[it] % 3 == 0 -> "Fizz"
            arr[it] % 5 == 0 -> "Buzz"
            else -> "${arr[it]}"
        }
    }
    return ret
}