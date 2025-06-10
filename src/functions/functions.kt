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

fun getMax(a: Int, b:Int): Int {
    val max = if (a > b) a else b
}