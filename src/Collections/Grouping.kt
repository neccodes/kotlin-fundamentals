package Collections

fun main(args: Array<String>) {
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.groupBy { it.first().uppercase() })
    println(numbers.groupBy({it.first()}, {it.uppercase()}))
}