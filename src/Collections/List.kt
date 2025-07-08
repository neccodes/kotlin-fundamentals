package Collections

fun main(args: Array<String>) {
    val names1 = listOf<String>("Name1", "Name2", "Name3")

    val names2 = mutableListOf<String>("Name1", "Name2", "Name3")

    println("names1[0] = ${names1[0]}")
    names2.add("Name4")
    names2.add("Name5")
    names2.remove("Name2")
    names2.forEach { println(it) }
}