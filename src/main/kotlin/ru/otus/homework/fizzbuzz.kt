package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    if (n <= 0) {
        println("Wrong array size")
        return emptyArray()
    }
    val output = Array(n, {"FizzBuzz"})
    for ( i in  output.indices) {
        if (i % 3 == 0 && i % 5 == 0)
            continue;
        else if (i % 3 == 0)
            output[i] = "Fizz"
        else if (i % 5 == 0)
            output[i] = "Buzz"
        else output[i] = "$i"
    }
    return output
}