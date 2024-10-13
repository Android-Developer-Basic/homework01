package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val arrIntup = Array(n) { i -> i }
    var arrOutput = Array(n){""}

    for (i in arrIntup){
        if (i%3==0 && i%5==0){
            arrOutput[i] = "FizzBuzz"
        }
        else if (i%3  == 0){
            arrOutput[i] = "Fizz"
        }
        else if (i%5==0){
            arrOutput[i] = "Buzz"
        }
        else{
            arrOutput[i] = i.toString()
        }
    }

    return arrOutput
}