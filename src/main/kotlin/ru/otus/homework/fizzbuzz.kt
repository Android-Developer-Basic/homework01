package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {

    val list = mutableListOf<String>()

    for(i in 0..n - 1){
        if ( i % 3 == 0 && i % 5 == 0)
            list.add("FizzBuzz")
        else if ( i % 3 == 0 )
            list.add("Fizz")
        else if ( i % 5 == 0)
            list.add("Buzz")
        else
            list.add(i.toString())
    }
    return list.toTypedArray()
}
