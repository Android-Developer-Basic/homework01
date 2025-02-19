package ru.otus.homework


fun main() {
    fizzbuzz(15)
}

private const val FIZZ = "Fizz"
private const val BUZZ = "Buzz"
private const val FIZZ_BUZZ = "FizzBuzz"

fun fizzbuzz(n: Int): Array<String> {
    val intArray = IntArray(n)
    val resultArray: Array<String> = Array(size = n, init = { "" })
    for (i in intArray.indices) {
        val divisible3: Boolean = i % 3 == 0
        val divisible5: Boolean = i % 5 == 0

        if (divisible3 && divisible5) {
            resultArray[i] = FIZZ_BUZZ
            continue
        } else if (divisible3) {
            resultArray[i] = FIZZ
            continue
        } else if (divisible5) {
            resultArray[i] = BUZZ
        } else {
            resultArray[i] = i.toString()
        }
    }
    resultArray.forEachIndexed { index, s ->
        print(
            "$s ${
                if (index != resultArray.size - 1) {
                    ", "
                } else {
                    ""
                }
            }"
        )
    }
    return resultArray
}