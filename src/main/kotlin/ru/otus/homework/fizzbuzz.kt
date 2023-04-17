package ru.otus.homework


fun fizzbuzz(n: Int): Array<String>  {
    val outputArray: Array<String> = Array(n){""}

    for (i in n - 1 downTo 0) {

        if (i%3 == 0 && i%5 != 0) {
            outputArray[i] = "Fizz"
        } else if (i%5 == 0 && i%3 != 0) {
            outputArray[i] = "Buzz"
        } else if (i == 0 || i%3 == 0 && i%5 ==0) {
            outputArray[i] = "FizzBuzz"
        } else {
            outputArray[i] = i.toString()
        }
    }

    return outputArray
}