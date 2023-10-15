package ru.otus.homework


fun fizzbuzz(n: Int):Array<String?> {
    var i = 0
    var array = arrayOfNulls<String>(n)
    while (i<n) {
        if ((i%3==0) and (i%5==0)){
            array[i] = "FizzBuzz"
        }
        else if (i%3==0) {
            array[i] = "Fizz"
        }
        else if (i%5==0) {
            array[i] = "Buzz"
        }
        else {
            array[i] = i.toString()
        }
        i++
    }
    return array
}

fun main(){
    print(fizzbuzz(readLine()!!.toInt()).contentToString())
}
