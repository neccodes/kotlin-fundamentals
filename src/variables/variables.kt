package variables

fun main(args: Array<String>) {
    println("Hello KotlinVille!")
    var userName: String = "Hatem"
    userName = "Karim"
    var age: Int = 20
    age = 23
    println("Hello, my name is ${userName.uppercase()} and i am $age years old.")
    println("Hello ${userName.uppercase()}, your age is $age!")
}