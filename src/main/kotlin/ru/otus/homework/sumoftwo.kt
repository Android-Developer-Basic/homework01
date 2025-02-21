package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    for (i in numbers.indices) {
        if (i+1 < numbers.size) {
            if (numbers[i] + numbers[i+1] == target) {
                val a = IntArray(2)
                a[0] = i
                a[1] = i+1
                return a
            }
        }
    }
    throw IllegalArgumentException("target not found")
}


fun main() {
    val t = 9
    val n = intArrayOf(9,3,7,3,0,3,9,4,8,2,0,9,3,4,8)
    val r = sumOfTwo(n, t)

    print(n.joinToString(",", "Input numbers = [", "], "))
    println("target = $t")
    println("Output: [${r[0]},${r[1]}]")
}
