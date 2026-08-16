package ru.otus.homework


/**
 * Ищет пару элементов [numbers], сумма которых равна [target], и возвращает их индексы
 * в порядке возрастания.
 *
 * Когда мы стоим на очередном элементе, второе слагаемое пары определено однозначно:
 * это `target - number`. Поэтому вместо перебора всех пар за O(n^2) достаточно за один
 * проход спрашивать у хэш-таблицы, встречалось ли нужное дополнение раньше — O(n) по
 * времени и O(n) по памяти.
 *
 * @throws IllegalArgumentException если подходящей пары нет
 */
fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    // "Хэш-таблица" (в некоторой степени) уже пройденных элементов: значение элемента и его индекс.
    val checked = mutableMapOf<Int, Int>()

    for ((index, number) in numbers.withIndex()) {
        val complementIndex = checked[target - number]
        if (complementIndex != null) return intArrayOf(complementIndex, index)

        checked[number] = index
    }

    // Если цикл дошёл до конца — пары нет.
    throw IllegalArgumentException("Нет пары чисел с суммой $target")
}