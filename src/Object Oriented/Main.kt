package OOP

fun main(args: Array<String>) {
    val car1 = Car("Tesla", "S Plaid", "Black", 4)

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Numbers of doors = ${car1.doors}")
    car1.move()
    car1.stop()
    
    println("\n")

    val car2 = Car("Ford", "Mustang", "Blue", 2)

    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Numbers of doors = ${car2.doors}")
    car2.move()
    car2.stop()
}

class Car(
    name: String,
    var model: String,
    var color: String,
    var doors: Int
) {
    var name = name.trim()
    fun move() {
        println("The car $name is moving..")
    }

    fun stop() {
        println("The car $name has stopped..")
    }
}
