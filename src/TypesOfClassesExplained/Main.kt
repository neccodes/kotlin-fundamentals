package TypesOfClassesExplained

import java.io.File
import java.time.ZonedDateTime

fun main(args: Array<String>) {
    val sessionStorage1 = SessionStorage(File("hello.txt"))
    val sessionStorage2 = SessionStorage(File("world.txt"))

    println(sessionStorage1 == sessionStorage2)  // false

    val file = File("hello.txt")
    val sessionStorage3 = SessionStorage(file)
    val sessionStorage4 = SessionStorage(file)

    println(sessionStorage3 == sessionStorage4)  // false

    val person = Person(
        "John Doe",
        "10-03-1993",
        "text@gmail.com"
    )

    println(person.birthdate)
    val person2 = person.copy("jane Doe")
    println(person2.birthdate)
    println(person == person2)  // false

    DateUtil.format(ZonedDateTime.now())
    DateUtil2.format(ZonedDateTime.now())
}

class SessionStorage(private val file: File) {
    var counter = 0

    fun save(value: String) {
        //...
    }
}

data class Person(
    val name: String,
    val birthdate: String,
    val email: String
) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }
}

object DateUtil {
    fun format(dateTime: ZonedDateTime): String {
        return ".."
    }
}

data object DateUtil2{
    fun format(dateTime: ZonedDateTime): String {
        return ".."
    }
}



