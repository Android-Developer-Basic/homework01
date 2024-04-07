package ru.otus.homework

/**
 * @param n - целое число, размер массива чисел
 * @return - массив строк который итерируется по массиву чисел и 0 до n и заполняется
 * следующим образом:
 * 1. Если число кратно трем, то в массив добавляем строку`Fizz`
 * 2. Если число кратно пяти, то в массив добавляем строку`Buzz`
 * 3. Если число кратно и трем, и пяти, то в массив добавляем строку`FizzBuzz`
 * (число 0 также должно добавлять строку `FizzBuzz`)
 * 4. Если число не кратно ни одному их этих чисел, то в массив нужно положить просто само число
 * приведенное к строке
 */
fun fizzbuzz(n: Int): Array<String> {
    val result = Array(n) {""}
    for (index : Int in 0 until  n){
        if (index % 3 == 0 && index % 5 == 0){
            result[index] = "FizzBuzz"
        }
        else if (index % 3 == 0){
            result[index] = "Fizz"
        }
        else if (index % 5 == 0)
            result[index] = "Buzz"
        else
            result[index] = index.toString()
    }
    return result
}

fun main(){
    for (i : String in fizzbuzz(0)){
        println(i)
    }
}