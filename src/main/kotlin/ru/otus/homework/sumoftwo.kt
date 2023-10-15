package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var massiv=IntArray(0)
    for (i in numbers.indices){
        for (j in numbers.indices) {
            if (i!=j && numbers[i]+numbers[j] == target) {
                massiv+=i
            }

        }
    }
    if (massiv.size==0) throw IllegalArgumentException()
    return massiv
}
fun main(){
    println("Vvedite razmer massiva: ")
    val size:Int = readLine()!!.toInt()
    val array = IntArray(size)
    println("Vvedite elementi massiva: ")
    for (i in 0..size-1) {
        array[i] = readLine()!!.toInt()
    }
    println(array.contentToString())
    println("Vvedite chislo: ")
    val target = readLine()!!.toInt()
    print(sumOfTwo(array,target).contentToString())

}

private operator fun IntArray.plusAssign(split: List<String>) {

}
