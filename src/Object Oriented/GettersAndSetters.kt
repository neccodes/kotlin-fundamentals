package OOP

fun main(args: Array<String>) {
    val user = Person("Alex")
    val friend = Person("John", "Wick")
    val user2 = Person(age = 19, firstName = "Ioana", lastName = "Dolly")

    user.firstName = "Vladimir"

    println(user.firstName)
    println(user.lastName)
    println(user.age)

    println("\n")

    println(friend.firstName)
    println(friend.lastName)
    println(friend.age)

    println("\n")

    println(user2.firstName)
    println(user2.lastName)
    println(user2.age)
}

class Person(firstName: String, var lastName: String = "LastName", var age: Int = 0) {
    var firstName = firstName
        get() {
            return "FirstName: $field"
        }
        // get() = field can also be used instead of the syntax above.
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }
    /*
    ILLUSTRATION OF GETTER AND SETTER
    fun setFirstName(newValue: String) {
        this.firstName = newValue
    }
    fun getFirstName(): String {
        return this.firstName
    }
    */
}