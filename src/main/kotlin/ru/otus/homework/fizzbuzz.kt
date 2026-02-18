package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {

    val arr: Array<String> = Array(size = n, init = { "" })

    for (i in arr.indices) {

        when {
            (i % 3 == 0) && (i % 5 == 0)-> arr[i] = "FizzBuzz"
            (i % 3 == 0) -> arr[i] = "Fizz"
            (i % 5 == 0) -> arr[i] = "Buzz"


            else -> arr[i] = i.toString()
        }

    }

    return arr

}