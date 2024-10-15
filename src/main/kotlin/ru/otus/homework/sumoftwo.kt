package ru.otus.homework

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    // TODO("Выполните задание")
    // Реализуйте тело функции следующим образом чтобы она возвращала массив целых чисел,
    // состоящий из индексов элементов массива numbers так,
    // чтобы сумма значений чисел находящихся на этих индексах была равна числу target.
    val lRetarray = IntArray(2)
    for (i in 0 .. numbers.lastIndex) {
        for (j in i+1..numbers.lastIndex) {
            if (numbers[i] + numbers[j] == target) {
                lRetarray[0] = i
                lRetarray[1] = j
                return lRetarray
            }
        }
    }
    // Если таких чисел нет, то выбросьте исключение IllegalArgumentException
    throw IllegalArgumentException()
}

