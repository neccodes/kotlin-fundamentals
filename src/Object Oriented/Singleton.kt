package OOP

fun main(args: Array<String>) {
    /*
     val instance: Database? = Database.getInstance()
    val instance2: Database? = Database.getInstance()
    println(instance)
    println(instance2) // we will have the same previous instance as its saved once only
     */
    println(Database)
    println(Database)
    println(Database)
    println(Database)
    println(Database)
    println(Database)
}

/*
class Database private constructor() {
    companion object {
        private var instance: Database? = null
        fun getInstance(): Database? {
            if (instance == null) {
                instance = Database()
            }

            return instance
        }
    }
}
*/

object Database{
    init {
        println("Database is being created..")
    }
}
