package Functions

fun main(args: Array<String>) {
    println(sum(5, 6, 7, 10, 5, 67, 8, 99))
    doSum(5, 6, 7, 10, 5, 67, 8, 99)
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}

fun doSum(vararg  numbers: Int) {
    numbers.forEach { println(it) }
}