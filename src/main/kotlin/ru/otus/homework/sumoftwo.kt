package ru.otus.homework

import java.lang.Exception

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var arrayOut =  intArrayOf(-1,-1)
    var index = 0
    var mutableMap= mutableMapOf<Int, MutableList<Int>>()
    numbers.forEach {
        if(mutableMap[it] == null){
            val refIndex = mutableListOf(index)
            mutableMap.put(it,refIndex)
        }else{
            mutableMap[it]!!.add(index)
        }
        index++
    }
    index = 0
    for (it in numbers) {
        arrayOut[0] = index
        val def = target - it
        if(mutableMap[def]!=null){
            val arr =mutableMap.get(def)!!
            when{
                arr.size==1 ->{
                    if(arr[0] != index) {
                        arrayOut[1] = arr[0]
                        break
                    }
                }
                arr.size > 1 -> {
                    if(arr[0] != index) {
                        arrayOut[1] = arr[0]
                    } else {
                        arrayOut[1] = arr[1]
                        break
                    }
                }
            }
        }
        index++
    }
    if(arrayOut[1] == -1 ) throw IllegalArgumentException()
    return arrayOut
}


