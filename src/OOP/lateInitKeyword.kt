package OOP

fun main(args: Array<String>) {
    val user = Plumber("Will", "Smith", 23)

    user.favoriteMovie = "Interstellar"
    println("User favorite movie is ${user.favoriteMovie}")
}

class Plumber(var firstName: String, var lastName: String = "LastName", var age: Int = 0) {
    lateinit var favoriteMovie: String
}

