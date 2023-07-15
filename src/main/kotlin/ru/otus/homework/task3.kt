package ru.otus.homework

class task3 {
    data class Person(val name: String, val surname: String, val age: Int)

    fun List<Person>.sortByAgeDescending(): List<Person> =
        sortedByDescending { it.age }

    fun List<Person>.sortByNameAlphabetically(): List<Person> =
        sortedWith(compareBy(Person::name, Person::surname))

    fun measureTimeMillis(block: () -> Unit): Long {
        val startTime = System.currentTimeMillis()
        block()
        return System.currentTimeMillis() - startTime
    }

    fun main() {
        val persons = listOf(
            Person("Daria", "Man", 31),
            Person("Daria", "Pon", 33),
            Person("Alice", "Man", 25),
            Person("Nick", "Pon", 29),
        )

        val sortedByAge = persons.sortByAgeDescending()
        println("Sorted by age (descending):")
        sortedByAge.forEach { println(it) }

        val sortedByName = persons.sortByNameAlphabetically()
        println("Sorted by name (alphabetically):")
        sortedByName.forEach { println(it) }

        val executionTime = measureTimeMillis {
            Thread.sleep(1000)
        }
        println("Execution time: $executionTime ms")
    }
}
