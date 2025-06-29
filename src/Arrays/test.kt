package Arrays

fun findMinAndMax(numbers: Array<Int>, searchMax: Boolean): Int {
    var max: Int = numbers[0]
    var min: Int = max

    if (searchMax) {
        for (number in numbers) {
            if (number > max) {
                max = number
            }
        }

        return max
    } else {
        for (number in  numbers) {
            if (number < min) {
                min = number
            }
        }

        return min
    }
}

fun main(args: Array<String>) {
    val max: Int = findMinAndMax(arrayOf(20,40,50,60, 100), true)
    val min: Int = findMinAndMax(arrayOf(20,40,50,60, 100), false)
    println("The max value is $max")
    println("The min value is $min")
}
