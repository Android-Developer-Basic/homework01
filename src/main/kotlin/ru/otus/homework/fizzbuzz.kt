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
    val fizzbuzzIntArray = Array(n){ it }
    var fizzbuzzStringArray = emptyArray<String>()

    for (item : Int in fizzbuzzIntArray){
        fizzbuzzStringArray = if (item % 3 == 0 && item % 5 == 0)
            fizzbuzzStringArray.plus("FizzBuzz")
        else if (item % 3 == 0)
            fizzbuzzStringArray.plus("Fizz")
        else if (item % 5 == 0)
            fizzbuzzStringArray.plus("Buzz")
        else {
            fizzbuzzStringArray.plus(item.toString())
        }
    }
    //return fizzbuzzStringArray
    return fizzbuzzStringArray
}

// Тут вызов для отладки и проверки
//fun main(){
//    for (i : String in fizzbuzz(10)){
//        println(i)
//    }
//}