@file:Suppress("UNREACHABLE_CODE")

package ru.otus.homework


fun fizzbuzz(n: Int): Array<out String?> {
    val numbers = arrayOfNulls<String>(n)

    if(n==0){
        return emptyArray<String>()
    }

    else {

        for (i in 0..n) {
            if (i % 3 == 0 && i % 5 == 0) {
                numbers[i] = "Fizz"
            } else if (i == 0) {
                numbers[i] = "Buzz"
            } else if (i / 3 == 0) {
                numbers[i] = "FizzBuzz"
            } else if (i / 5 == 0) {
                numbers[i] = "FizzBuzz"
            } else {
                numbers[i] = i.toString()
            }
        }
    }


    return numbers
}