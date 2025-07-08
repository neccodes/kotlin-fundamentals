package Collections

fun main(args: Array<String>) {
    val numbers: List<String> = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })
    println(numbers.associateWith{it.first().uppercase()})
    println(numbers.associateBy({it.first().uppercase()}, {it.length}))

    // Flatten
    val numbersSet : Array<Array<Int>> = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
    println("numbersSet[2][2] = ${numbersSet[2][2]}")

    val myNumbersSet: List<Set<Int>> = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
    for (numbers in myNumbersSet) {
        for (number in numbers) {
            println(number)
        }
        println("\n")
    }

    val numbersFlatten: List<Int> = numbersSet.flatten()
    println(numbersFlatten[8])
    for (number in numbersFlatten) {
        println(number)
    }
}


