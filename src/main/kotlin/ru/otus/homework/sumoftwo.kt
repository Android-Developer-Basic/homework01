package ru.otus.homework

/**
 * @param numbers массив целых чисел numbers
 * @param target целое число
 * @return массив целых чисел, состоящий из индексов элементов массива numbers,
 * сумма значений чисел находящихся на этих индексах равна числу target.
 */
fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val resultArray = IntArray(2)
    loop1@ for (lIndex : Int in numbers.indices){
        var rIndex = 0
        if (rIndex == lIndex)
            rIndex++
        while (numbers[lIndex] + numbers[rIndex] != target){
            rIndex++
            if (rIndex == lIndex)
                rIndex++
            if (rIndex == numbers.size)
                continue@loop1
        }
        resultArray[0] = lIndex
        resultArray[1] = rIndex
        break
    }
    if (resultArray[0] == 0 && resultArray[1] == 0)
        throw IllegalArgumentException("Прокидываем ошибку \"IllegalArgumentException\"")

    return resultArray
}

//fun main(){
//    val Array2 = intArrayOf(3, 2, 4)
//    for (i : Int in sumOfTwo(Array2, 6))
//        println(i)
//
//}