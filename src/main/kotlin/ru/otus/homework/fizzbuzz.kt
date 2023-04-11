package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    if(n == 0) return arrayOf()
    val initialBuffer = Array(n) { 0 }
    for(index in initialBuffer.indices) initialBuffer[index] = index
    val outStringBuffer : Array<String> = Array(n) { "" }
    initialBuffer.forEachIndexed{index, element ->
        if(((element % 3 == 0) and (element % 5 == 0)) or (element == 0))
            outStringBuffer[index] = "FizzBuzz"
        else if((element % 3 == 0))
            outStringBuffer[index] = "Fizz"
        else if(initialBuffer[index] % 5 == 0)
            outStringBuffer[index] = "Buzz"
        else
            outStringBuffer[index] = initialBuffer[index].toString()
    }
    return outStringBuffer
}