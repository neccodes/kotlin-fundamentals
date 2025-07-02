package Inheritances

fun main(args: Array<String>) {
    val name1: String = "Alex"
    val name2: String = "Alex"

    println(name1 === name2)
    println("name1 == name2: ${name1.equals(name2)}")

    val user1 = User("Alex", "Dobbin", 23)
    val user2 = User("John", "Doe", 30)

    println("user1.equals(user2): ${user1.equals(user2)}")

    println("user1 = $user1")
    println("user2 = $user2")
}

data class User(
    var firstName: String,
    var lastName: String,
    var age: Int
)
/*
    {
    override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            if (other is User) {
                return this.firstName == other.firstName
                        && this.lastName == other.lastName && this.age == other.age
            }

            return false
        }

        override fun hashCode(): Int {
            return 0
        }

        override fun toString(): String {
            return "User(firstname = $firstName, lastname = $lastName, age = $age)"
        }
    }
*/