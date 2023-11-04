package ru.otus.homework

fun fizbuzz(n:IntArray) {
    var i = 0
    val k1 = "Fizz"
    val k2 = "Buzz"
    println("Homework01-1")
    while( i in n.indices){
        val s = n[i]
        val s1 = s%3
        val s2 = s%5

        if ((s1==0) && (s2==0) && (s==0)) { println("$s - $k1$k2") }
        else if (s1==0) { println("$s - $k1") }
        else if (s2==0) { println("$s - $k2") }
        else println("$s - $s")

        i++;
    }
}

fun main() {
    val nums = intArrayOf(0, 1, 2, 3, 4, 5,6,7,8,9,10)
    fizbuzz(nums)
    val nummmm = intArrayOf(2, 7, 11, 15)
    sumOfTwo(nummmm, 9)
}
