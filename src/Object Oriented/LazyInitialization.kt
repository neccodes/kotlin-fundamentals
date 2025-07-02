package OOP

fun main(args: Array<String>) {
    val user1 = Pilot("Alex", "Perry", 23)
    val user2 by lazy {
        Pilot("User1", "lastName", 0)
    }

    println("user2.firstName = ${user2.firstName}")
}

class Pilot(var firstName: String, var lastName: String, var age: Int) {
    init {
        println("User: $firstName was created..")
    }
}

