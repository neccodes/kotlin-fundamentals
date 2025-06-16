package operators

fun main(args: Array<String>) {
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0

    while (number <= lastNumber) {
        number++

        if (!isEvenNumber(number)) {
            continue
        }
        evenNumberCounter++
        println(number)
    }

    println("Now we are looping using the for loop.")
    evenNumberCounter = 0
    for (i in 1..20) {
        if ((i % 2) != 0) {
            continue
        }

        evenNumberCounter ++
        println(i)
    }

    println("Total number evenNumber found with the while loop: $evenNumberCounter")
    println("Total number of number found using for-loop are: $evenNumberCounter")
}

fun isEvenNumber(number: Int): Boolean {
    if ((number % 2) == 0) {
        return true
    } else {
        return false
    }
}