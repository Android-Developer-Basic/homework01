package ru.otus.homework



fun main(){

    val target = 4
    val numbers: IntArray = intArrayOf(1, 5, 7, 8 , 3, 4)

    val mass = sumOfTwo(numbers, target)

    for(i in mass.indices) println(mass[i])

}

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    val result = IntArray(2)

   loop@ for (i in numbers.indices){
        for (j in numbers.indices){
            if (i != j) {
                if (target == (numbers[i] + numbers[j])) {
                    result[0] = i
                    result[1] = j
                    break@loop
                }
            }
        }
    }

        if (result.all { it == 0 }) {
            throw IllegalArgumentException()
        }

return result
}

