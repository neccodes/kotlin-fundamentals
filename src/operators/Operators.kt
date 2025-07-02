package operators

fun main(args: Array<String>) {
    var x = 5
    val y = 3
    var result = x + y
    println("result = $result")
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x / y = ${x / y}")
    println("x * y = ${x * y}")
    println("x % y = ${x % y}")

    println("3 + 3 * 4 = ${(3 + 3) * 4}")
    println("3 + 3 * 4 = ${(3 + 3 * 4)}")
    result = x + y
    result += 2
    println("result = $result")
    result -= 2
    println("result = $result")
    result *= 2
    println("result = $result")
    result /= 2
    println("result = $result")

    x = 0
    println("x++ = ${x++}")
    println("++x = ${++x}")

    println("x-- = ${x--}")
    println("--x = ${0}")

    val myNumber = 50
    if (myNumber < 15) {
        println("my number is greater than 15")
    } else if (myNumber > 40 ) {
        println("my number is greater than 40")
    } else {
        println("All the conditions failed!")
    }

    var isActive: Boolean = true
    if (isActive) {
        println("The condition is true!")
    } else {
        println("The condition is false!")
    }

    isActive = true
    val score = 100
    val internetSpeed = 5000

    if (isActive && score == 100 && internetSpeed == 5000) {
        println("You're at the next level!")
    } else {
        println("You're at the same level!")
    }

    val num1 = 5
    val num2 = -4
    if (num1 > 0 || num2 > 0) {
        println("The condition is true!")
    } else {
        println("The condition is false!")
    }
    // if-else statement as an expression.
    val text = if (num1 > 0 || num2 > 0) "This is text1" else "This is text2"
    println("$text")


}