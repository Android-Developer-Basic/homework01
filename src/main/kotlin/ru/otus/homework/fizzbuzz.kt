package ru.otus.homework

fun fizzbuzz(n: Int): Array<String> {
    var list_str: Array<String> = arrayOf<String>()
    if(n == 0) return list_str
    for(i in IntRange(0, n - 1) step 1) {
        if (i == 0)
        {
            list_str += "FizzBuzz"
            continue
        }
        if (i % 3 == 0 && i % 5 == 0)
        {
            list_str += "FizzBuzz"
            continue
        }
        if (i % 3 == 0)
        {
            list_str += "Fizz"
            continue
        }
        if (i % 5 == 0)
        {
            list_str += "Buzz"
            continue
        }
        list_str += i.toString()
    }
    return list_str
}