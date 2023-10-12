package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val aInts=IntArray(n) {i->i}

    val aOut = Array<String>(n){""}

    aInts.forEach() { i ->
        if ( (i % 3 == 0) && (i % 5 == 0 ) ) {
            aOut[i] = "FizzBuzz"
        } else if ( (i % 3) == 0) {
            aOut[i] = "Fizz"
        } else if ((i % 5) == 0) {
            aOut[i] = "Buzz"
        } else {
            aOut[i] = i.toString()
        }
    }
    return aOut
}
