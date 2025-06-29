package OOP

fun main(args: Array<String>) {
    for (direction in Direction.values()) {
        println(direction)
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 30),
    WEST("west", 40)
}