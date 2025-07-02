package operators

fun main(args: Array<String>) {
    var number = 0
    // nested loop
    outer@ while (number < 10) {
        number ++
        println(number)

        var i = 0
        while (i < 5) {
            if (i == 0) break@outer
            i++
            println("***$i")
        }
    }
}