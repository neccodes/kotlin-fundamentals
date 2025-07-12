package Collections

fun main(args: Array<String>) {
    val numbers = listOf("One", "Two", "Three", "Four", "Five")
    println("numbers.elementAt(3) = ${numbers.elementAt(3)}")
    println("numbers.last() = ${numbers.last()}")
    println("numbers.first() = ${numbers.first()}")

    println("\n")
    println(numbers.first {it.length > 3})
    println(numbers.last { it.startsWith("F") })
    println(numbers.random())
    println("numbers.isEmpty() = ${numbers.isEmpty()}")
}