package Collections

fun main(args: Array<String>) {
    val numbers = listOf("one","two", "three", "four", "five", "six")
    println("numbers.slice(1..3) = ${numbers.slice(1..3)}")
    println("numbers.slice(0..4 step 2) = ${numbers.slice(0..4 step 2)}")
    println("numbers.slice(setOf(3, 5, 0)) = ${numbers.slice(setOf(3, 5, 0))}")

    println("\n")
    println("numbers.take(3) = ${numbers.take(3)}")
    println("numbers.takeLast(3) = ${numbers.takeLast(3)}")
    println("numbers.drop(1) = ${numbers.drop(1)}")
    println("numbers.dropLast(5) = ${numbers.dropLast(5)}")

    println("\n")
    println(numbers.takeWhile { !it.startsWith("f") })
    println(numbers.takeLastWhile { it != "three" })
    println(numbers.dropWhile { it.length == 3 })
    println(numbers.dropLastWhile { it.contains("i") })

    println("\n")
    val numbersInt = (0..13).toList()
    println(numbersInt.chunked(3))
    println(numbersInt.chunked(3) { it.sum() })

    val numbersStrings2 = numbers
    println(numbersStrings2.windowed(3))
}