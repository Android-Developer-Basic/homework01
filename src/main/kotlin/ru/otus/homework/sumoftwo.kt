package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
  val result = mutableListOf<Int>()
  val cache = mutableMapOf<Int, Int>()

  for ((index, value) in numbers.withIndex()) {
    val diff = target - value

    if (cache.containsKey(diff)) {
      result.add(cache[diff]!!)
      result.add(index)
    }

    cache.put(value, index)
  }

  if (result.size == 0) {
    throw IllegalArgumentException()
  }

  return result.toIntArray()
}

fun main() {
  println(sumOfTwo(
    numbers =  intArrayOf(2, 7, 11, 15),
    target = 9,
  ).contentToString())

  println("---")

  println(sumOfTwo(
    numbers =  intArrayOf(2, 4, 6, 8, 10),
    target = 14,
  ).contentToString())
}
