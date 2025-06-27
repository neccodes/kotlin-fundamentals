package arrays

fun main(args: Array<String>) {
    val names: Array<String> = arrayOf("John", "Stephen", "Meghan")
    val mixedElements: Array<out Any> = arrayOf(3, 6, 8, 9, 3, "Name 1", "a")

    names[0] = "Alex"
    println("First element: ${names[0]}")
    println("The size of the array is: ${names.size}")

    for (i in mixedElements) {
       if (i is String) {
           println(i)
       }
    }
}
