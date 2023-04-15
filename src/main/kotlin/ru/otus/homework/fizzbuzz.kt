package ru.otus.homework

fun main() {

    val n: Int = 40

    fizzbuzz(n)

}
fun fizzbuzz(n: Int): Array<String> {

    val array = Array<String>(n){""}

    for(i in 0 until n){          //until до n не включая

        if(i == 0){
            array[i] = "FizzBuzz"
            } else if (i % 3 == 0){
            array[i] = "Fizz"
            } else if (i % 5 == 0){
            array[i] = "Buzz"
            } else if ((i % 3 == 0) && (i % 5 == 0)){
            array[i] = "FizzBuzz"
            } else {
            array[i] = i.toString()
        }

        println(array[i])
    }


    return array
}


