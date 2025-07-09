package Collections

fun main(args: Array<String>) {
    val numbers: List<String> = listOf("One", "Two", "Three", "Four")
    val longerThan3: List<String> = numbers.filter { it.length > 3 }
    println("longerThan3 = $longerThan3")

    val numbersMap: Map<String, Int> = mapOf("Key 1" to 1, "Key 2" to 2, "Key 3" to 3, "Key 101" to 101)
    val filteredMap: Map<String, Int> = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }
    println("filteredMap = $filteredMap")

    val filteredIndex: List<String> = numbers.filterIndexed { index: Int, value: String -> (index != 0) && (value.length < 5) }
    val filteredNot: List<String> = numbers.filterNot { it.length <= 3 }
    println("filteredIndex = $filteredIndex")
    println("filteredNot = $filteredNot")

    val mixedList = listOf(1, 2, 3, 'A', 'B', 'C', "Hello World", "Alex", false)
    mixedList.filterIsInstance<Char>().forEach { println(it) }
    mixedList.filterIsInstance<Int>().forEach { println(it) }
    mixedList.filterIsInstance<String>().forEach { println(it) }
    mixedList.filterIsInstance<Boolean>().forEach { println(it) }

    // partition
    println("\n")
    val (match, rest) = numbers.partition { it.length > 3 }
    println("match = $match")
    println("rest = $rest")

    // Predicator
    println("\n")
    println(numbers.any { it.endsWith("e") })
    println(numbers.none { it.endsWith("w") })
    println(numbers.all { it.length > 1 })
}