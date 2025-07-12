package Collections

fun main(args: Array<String>) {
    val fruits = listOf("Orange", "Pineapple", "Avocado", "Grapes", "Mangoes", "Lemon", "Pawpaw", "Potatoes")
    println("fruits.slice(1..4) = ${fruits.slice(1..4)}")
    println(fruits.takeWhile {!it.startsWith("L")})
    println(fruits.dropLast(3))

    val takeLast3Fruits = fruits.takeLast(3)
    println("takeLast3Fruits = $takeLast3Fruits")

    val dropLast4Fruits = fruits.dropLast(4)
    println(dropLast4Fruits)

    val selectFruitsStaringWithF = fruits.takeWhile { !it.startsWith("P") }
    println("selectFruitsStartingWithF = $selectFruitsStaringWithF")
}