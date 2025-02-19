package ru.otus.homework


import kotlin.random.Random
fun main(){
    val numbers = IntArray(5)

    val target = 7
    for (i in 0 until numbers.size) {
        numbers[i] = Random.nextInt(0, 10)
        println("индекс " + i + " элемент " + numbers[i])
    }
    val a = sumOfTwo(numbers, target)
    for (i in 0 until a.size ){
        println("Новый массив " + a[i])
    }
}


fun sumOfTwo(numbers: IntArray, target: Int): Array<Int> {
    var ind = emptyArray<Int>()

    for (i in 0 until numbers.size) {
        for (j in i + 1 until numbers.size){

            if (numbers[i] + numbers[j] == target)  {
                ind += i
                ind += j
            }

        }
    }

    if (ind.size == 0) {
        throw IllegalArgumentException ("Нет элементов массива удовлетворяющих условию")
    }

    return ind
}
