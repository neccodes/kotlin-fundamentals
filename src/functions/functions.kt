package functions

fun main(args: Array<String>) {
    sayHello("Aaron", 35)
    sayHello("Peter", 25)
    val hasInternetConnexion = true
    if (hasInternetConnexion) {
        getData("Some data")
    } else {
        showMessage()
    }

    val max = getMax(5, 17, 56)
    println(max)

    val min = getMin(5.7, 9.2)
    println(min)

    sendMessage("Hatem", "Hello buddy")
    sendMessage("Karim")
    sendMessage(message = "Hello my dear")

    sendText()
}

fun sayHello(name: String, age: Int) {
    val number = age
    println("Hello, $name,your age is $number.")
}

fun getData(data: String) {
    println("The data is $data!")
}

fun showMessage() {
    println("There is no internet connexion!")
}

fun getMax(a: Int, b:Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}
fun getMin(a: Double, b: Double): Double = if (a < b) a else b

// function with default parameters
fun sendMessage(name: String = "User", message: String = sendText()) {
    println("Name = $name and Message = $message.")
}

fun sendText(): String = "Some Text here to be written"