package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val arr = Array(n){""}
    var i3: Boolean
    var i5: Boolean
    for (i in 0 until n) {
        i3 = i%3 == 0
        i5 = i%5 == 0
        arr[i] = if (i == 0 || (i3 && i5)) "FizzBuzz" else if (i3) "Fizz" else if (i5) "Buzz" else i.toString()
    }
    return arr
}
