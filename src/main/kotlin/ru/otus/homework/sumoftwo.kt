@file:Suppress("UNREACHABLE_CODE")

package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

        val map = mutableMapOf<Int, Int>() // Создаем карту для хранения чисел и их индексов
        for (i in numbers.indices) {
            val complement = target - numbers[i] // Вычисляем дополнение для текущего числа
            if (map.containsKey(complement)) {
                // Если дополнение уже присутствует в карте, возвращаем его индекс и текущий индекс
                return intArrayOf(map[complement]!!, i)
            }
            // В противном случае сохраняем текущее число и его индекс в карту
            map[numbers[i]] = i
        }
        // Если не найдено соответствующих чисел, выбрасываем исключение IllegalArgumentException
        throw IllegalArgumentException("No two sum solution")
    }

    fun main() {
        val numbers = intArrayOf(2, 7, 11, 15)
        val target = 9
        try {
            val result = sumOfTwo(numbers, target)
            println("Индексы чисел, дающих сумму $target: ${result.joinToString()}")
        } catch (e: IllegalArgumentException) {
            println("Исключение: ${e.message}")
        }
    }
