package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {

    val a: Array<String?> = arrayOfNulls<String>(n)
    for (i in 0 until n) {
        a[i] =
            if (i%3 == 0) {
                if (i%5 == 0) {
                    "FizzBuzz"
                }
                else {
                    "Fizz"
                }
            }
            else {
                if (i%5 == 0) {
                    "Buzz"
                }
                else {
                    i.toString()
                }
            }
    }
    return a.requireNoNulls()
}


fun main() {
    val d = 32
    val a = fizzbuzz(d)
    println("Input: n = $d")
    println(a.joinToString(", ", "Output: [", "]"))
}
