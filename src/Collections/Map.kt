package Collections

fun main(args: Array<String>) {
    val users = mutableMapOf<Int, String>(1 to "Maria", 2 to "Alex", 3 to "Hatem", 4 to "Roger", 5 to "John")
    users[5] = "Vladimir"
    users.remove(2)
    users.forEach {t, u ->
        println("$t and $u")
    }

    println("users[1] = $users[1]")
}