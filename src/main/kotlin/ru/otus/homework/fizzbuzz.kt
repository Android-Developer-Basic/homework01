package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    var intArr = Array<Int>(n) {it}
    var strArr = Array<String>(n) {""}

    var dividedBy_3 : Boolean = false
    var dividedBy_5 : Boolean = false

    for( i in intArr.indices ){
        dividedBy_3 = intArr[i] % 3 == 0
        dividedBy_5 = intArr[i] % 5 == 0

        if( dividedBy_3 && !dividedBy_5 ){
            strArr[i] = "Fizz"
        }
        else if( !dividedBy_3 && dividedBy_5 ){
            strArr[i] = "Buzz"
        }
        else if( dividedBy_3 && dividedBy_5 ){
            strArr[i] = "FizzBuzz"
        }
        else{
            strArr[i] = "${intArr[i]}"
        }
    }

    return strArr
}