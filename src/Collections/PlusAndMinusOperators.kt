package Collections

fun main(args: Array<String>) {
    val numbers = mutableListOf("one", "two", "three", "four")
    val plusList = numbers + "five"
    val minusList = numbers - mutableListOf("three", "four")

    println("plusList = $plusList")
    println("minusList = $minusList")
}