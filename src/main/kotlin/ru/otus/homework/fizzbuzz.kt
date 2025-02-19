package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val generatedArray = IntArray(n){i -> i  }
    val result = ArrayList<String>()
    for (ii in 0..<n) {
        var resultString = ""
        if(generatedArray[ii] == 0){
            resultString = "FizzBuzz"
        }
        if (generatedArray[ii] % 3 == 0) {
            resultString="Fizz"
        }
        if (generatedArray[ii] % 5 == 0){
            resultString += "Buzz"
        }
        if (resultString == "") {
            resultString = generatedArray[ii].toString()
        }
        result.add(resultString)
    }
    return result.toTypedArray()
}