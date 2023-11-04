package ru.otus.homework

fun sumOfTwo(numbers: IntArray, target: Int) {
    var m = 0
    println("\nHomework01-2")
    for(i in numbers.indices) {
        while (m <= 3) {
            val g = m+1
            val h = numbers[m]
            val h1 = numbers[g]
            val k = h1+h
            if (k == target) {
                println("[$m],[$g]")
            }
            else {
                val z = m ?: throw IllegalArgumentException("Name required")
            }
            m++
        }
    }
}


