package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val arr_input = (0..n-1).toList().toIntArray()
    var arr_output = arrayOf<String>()
    arr_input.forEach {
        if(it == 0)
            arr_output += "FizzBuzz"
        else if (it % 5 == 0 && it % 3 == 0)
            arr_output += "FizzBuzz"
        else if (it % 5 == 0)
            arr_output +="Buzz"
        else if (it % 3 == 0)
            arr_output += "Fizz"
        else
            arr_output += it.toString()
    }
    return arr_output
}