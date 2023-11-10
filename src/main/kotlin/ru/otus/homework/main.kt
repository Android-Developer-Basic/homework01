import ru.otus.homework.fizzbuzz
import ru.otus.homework.sumOfTwo

fun main(){
    val fizzbuzzResult = fizzbuzz(10)
    val sumOfTwoResult = sumOfTwo(intArrayOf(2,7,11,15), 9)

    println(fizzbuzzResult.toList())
    println(sumOfTwoResult.toList())
}