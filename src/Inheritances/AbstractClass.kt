package Inheritances

fun main(args: Array<String>) {

}

abstract class Apparel {
    abstract fun move()
    abstract fun stop()
}

class Bus(
    var name: String,
    var color: String,
    var engines: Int,
    var doors: Int
): Apparel() {
    override fun move() {
        println()
        TODO()
    }

    override fun stop() {
        TODO()
    }

}