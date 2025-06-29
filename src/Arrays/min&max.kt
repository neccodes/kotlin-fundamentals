package Arrays

fun findMax(numbers: Array<Int>): Int {
    var max = numbers[0]

    for (number in numbers) {
        if (number > max) {
            max = number
        }

    }

    return max
}

fun findMin(numbers: Array<Int>): Int {
    var min = numbers[0]

    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }

    return min
}

fun main(args: Array<String>) {
    val max: Int = findMax(arrayOf(4,6,7,4,3,6))
    val min: Int = findMin(arrayOf(4,7,9,20,7, 100))
    println("Max value = $max")
    println("Min value = $min")
}