fun fizzbuzz(n: Int): Array<String> {
    val intArray = IntArray(n) { it }
    var stringArray = arrayOf<String>()

    for (i in intArray) {
        val isMultipleThree = i % 3 == 0
        val isMultipleFive = i % 5 == 0

        stringArray += if (i == 0 || (isMultipleThree && isMultipleFive)) {
            "FizzBuzz"
        } else if (isMultipleThree) {
            "Fizz"
        } else if (isMultipleFive) {
            "Buzz"
        } else {
            i.toString()
        }
    }

    return stringArray
}