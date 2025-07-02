package OOP

fun main(args: Array<String>) {
    val result = Calculator.sum(5, 10)
    println("Result = $result")
}

class Calculator() {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}