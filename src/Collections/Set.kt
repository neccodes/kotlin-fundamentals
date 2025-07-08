package Collections

fun main(args: Array<String>) {
    val user1 = User("Name1")
    val user2 = User("Name2")
    val user3 = User("Name3")
    val user4 = User("Name4")
    val user5 = User("Name5")
    val user6 = User("Alex")
    val user7 = User("Alex")

    val names = mutableSetOf<User>(user1, user2, user3,user4, user5, user6, user7)

    names.forEach { println(it.name) }
}
data class User(var name: String)