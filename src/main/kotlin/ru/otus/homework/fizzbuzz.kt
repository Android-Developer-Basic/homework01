package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    var arrNumbers = Array<Int>(n) { 0 }
    var i: Int
    var result = arrayOfNulls<String>(n )

    if(n == 0)
        return emptyArray<String>()

    for(i in 0..(n-1))
    {
        arrNumbers[i] = i
    }

    for(i in 0..(n-1))
    {
        if( arrNumbers[i] == 0 || arrNumbers[i] % 3 == 0 && arrNumbers[i] % 5 == 0 ) {
            result[i] = "FizzBuzz"
        }
        else if( arrNumbers[i] % 3 == 0 ) {
            result[i] = "Fizz"
        }
        else  if( arrNumbers[i] % 5 == 0 ) {
            result[i] = "Buzz"
        }
        else
        {
            result[i] = arrNumbers[i].toString()
        }
    }
    return result as Array<String>
}