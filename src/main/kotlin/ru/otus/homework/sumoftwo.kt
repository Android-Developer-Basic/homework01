package ru.otus.homework

fun main(args: Array<String>) {
    val numbersArray = intArrayOf(10, 7, 11, 15, 2)
    val target = 9
    println(sumOfTwo(numbersArray, target).contentToString())

}

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    val indexcesArray = intArrayOf(0, 0)
    numbers.forEachIndexed { index, value ->

        for (nextIndex in index + 1 until numbers.size) {
            val nextValue = numbers[nextIndex]
            val sumOfTwoValues = value + nextValue

            if (sumOfTwoValues == target) {
                indexcesArray[0] = index
                indexcesArray[1] = nextIndex
            }

        }

    }
    if (indexcesArray[0] != 0 && indexcesArray[1] != 0) return indexcesArray else throw IllegalArgumentException("not values")


}