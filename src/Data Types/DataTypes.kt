package `Data Types`

fun main(args: Array<String>) {
    println("Hello KotlinVille!")
    var userName: String = "Hatem"
    userName = "Karim"
    var age: Int = 20
    age = 23
    println("Hello, my name is ${userName.uppercase()} and i am $age years old.")
    println("Hello ${userName.uppercase()}, your age is $age!")

    val integerMinValue = Int.MIN_VALUE
    val integerMaxvalue = Int.MAX_VALUE
    println("Integer max Value = $integerMaxvalue")
    println("integer min Value = $integerMinValue")

    val byteMaxvalue: Byte = Byte.MAX_VALUE
    val byteMinValue: Byte = Byte.MIN_VALUE
    println("byte max value = $byteMaxvalue")
    println("byte min value = $byteMinValue")

    val shortMaxValue: Short = Short.MAX_VALUE
    val  shortMinValue: Short = Short.MIN_VALUE
    println("short min value = $shortMinValue")
    println("short max value = $shortMaxValue")

    val longMaxValue = Long.MAX_VALUE
    val longMinValue = Long.MIN_VALUE
    println("long max value = $longMaxValue")
    println("long min value = $longMinValue")

    val myNumber = 28L

    // Float and Double
    val firstNumber = 2.5F
    val secondNumber = 2.5
    println("my number is $firstNumber and my second number is $secondNumber.")

    // Char and Boolean
    val myCharValue: Char = 'C'
    val myBooleanValue: Boolean = true
}