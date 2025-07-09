package Collections

fun main(args: Array<String>) {
    val numbersString: List<String> = listOf("One", "Two", "Three", "Four")
    println(numbersString)
    println(numbersString.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    println(numbersString.joinTo(listString))

    println(numbersString.joinToString(" | ", "start: ", ": end"))

    val numbers: List<Int> = (1..100).toList()
    println(numbers.joinToString(limit = 25, truncated = "<...>"))

    println(numbersString.joinToString { "Element: ${it.uppercase()}" })
}