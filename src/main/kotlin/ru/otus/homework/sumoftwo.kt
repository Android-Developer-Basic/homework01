package ru.otus.homework

/**
 * @param numbers массив целых чисел numbers
 * @param target целое число
 * @return массив целых чисел, состоящий из индексов элементов массива numbers,
 * сумма значений чисел находящихся на этих индексах равна числу target.
 */
fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var resultArray = IntArray(0)
    for (i : Int in numbers.indices){
        var a = 0
        if (a == i)
            a++
        try {
            while (numbers[i] + numbers[a] != target){
                a++
                if (a == i)
                    a++
            }
            resultArray = resultArray.plus(i)
            resultArray = resultArray.plus(a)
            break
        }
        catch (e: ArrayIndexOutOfBoundsException) {
            println("Перехват ошибки \"ArrayIndexOutOfBoundsException\"")
        }
    }
    try {
        resultArray [0]
    }
    catch (e: ArrayIndexOutOfBoundsException) {
        throw IllegalArgumentException("Прокидываем ошибку \"IllegalArgumentException\"")
    }
    return resultArray
}

// Тут вызов для отладки и проверки
//fun main(){
//    val Array2 = intArrayOf(3, 2)
//    for (i : Int in sumOfTwo(Array2, 6))
//        println(i)
//
//}