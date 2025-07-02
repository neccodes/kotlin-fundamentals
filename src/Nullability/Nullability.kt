package Nullability

fun main(args: Array<String>) {
    var text: String? = "Name"
    text = null
    text = "This variable is not null."
    println(text?.length)
    if (text !=  null) {
        println(text)
        println("text.length = ${text.length}")
    } else {
        println("The variable is null!")
    }

    // shot way of writing variable with null value.
    val text2: String = text ?: "The variable is null!"
    println(text2)
}