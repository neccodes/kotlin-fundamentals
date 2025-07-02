package OOP


fun main(args: Array<String>) {
    val user = MyUser("Alex")
    val friend = MyUser("John", "Wick")

    println("Name: ${user.name}")
    println("LastName: ${user.lastName}")
    println("Age: ${user.age}")

    println("\n")

    println("Name: ${friend.name}")
    println("LastName: ${friend.lastName}")
    println("age: ${friend.age}")
}

class MyUser(var name: String, var lastName: String, var age: Int) {

    constructor(name: String): this(name, "LastName", 0) {
        println("Second constructor")
    }

    constructor(name: String, lastName: String): this(name, lastName, 0) {
        println("Third constructor")
    }
}