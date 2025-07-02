package OOP

fun main(args: Array<String>) {
    val user = Driver("Alex")
    val friend = Driver("John", "Wick")
    val user2 = Driver(age = 19, firstName = "Ioana", lastName = "Dolly")

    println("Name: ${user.firstName}")
    println("LastName: ${user.lastName}")
    println("Age: ${user.age}")

    println("\n")

    println("Name: ${friend.firstName}")
    println("LastName: ${friend.lastName}")
    println("age: ${friend.age}")

    println("\n")

    println("Name: ${user2.firstName}")
    println("LastName: ${user2.lastName}")
    println("age: ${user2.age}")
}

class Driver(var firstName: String, var lastName: String = "LastName", var age: Int = 0) {}