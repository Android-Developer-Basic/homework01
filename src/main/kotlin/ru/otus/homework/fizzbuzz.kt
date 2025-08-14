package ru.otus.homework

import kotlin.random.Random


fun fizzbuzz(n: Int): Array<String> {

    val names = arrayOf("Fizz", "Buzz")
    val numbers = arrayOfNulls<Int>(n)
    val result = arrayOfNulls<String>(n)

    numbers[0] = 0
    for( i in 1..n-1) {
        numbers[i] = Random.nextInt(0, 25)
    }
    for(i in 0..n-1){
        if( numbers[i] == 0){
            result[i] = names[0] + names[1]
        }
        else if (   numbers[i]?.rem(3) ==0 && numbers[i]?.rem(5) ==0  ){
            result[i] = names[0]+names[1]
        }
        else if(  numbers[i]?.rem(3) == 0  ){
            result[i] = names[0]
        }
        else if(  numbers[i]?.rem(5) == 0  ){
            result[i] = names[1]
        }
        else {
            result[i] = numbers[i].toString()
        }
    }
    return result as Array<String>
}
