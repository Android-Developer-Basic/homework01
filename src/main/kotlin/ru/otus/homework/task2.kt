package ru.otus.homework

class task2 {
    fun main() {
        val list = (0..99).toMutableList() // Создаем список и заполняем его целыми числами 0-99
        println(list)
        list.removeAll { it % 2 != 0 } // Удаляем все нечетные числа из списка
        println(list)
        val slice = list.subList(10, 21) // Получаем слайс с 10 по 20 элементы
        println(slice)
        slice.replaceAll { it + 1 } // Добавляем к каждому элементу 1
        println(slice)
        val sum = slice.sum() // Суммируем все оставшиеся числа и получаем сумму
        println("Сумма: $sum") // Выводим сумму
    }
}
