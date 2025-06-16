package loops

fun main(args: Array<String>) {
    // general syntax
    for (i in 1..10) {
        println("i = $i")
    }

    // use of until
    for (i in 1 until 10) {
        println(i)
    }

    // us of downTo
    for (i in 10 downTo 1) {
        println(i)
    }

    // using steps
    for (i in 1..10 step 2) {
        println(i)
    }

    // while loop
    var number = 0
    while (number < 10) {
        println(number)
        number ++
    }

    // do...while loop
    number = 0
    do {
        println(number)
        number ++
    } while (number < 5)

    // use of continue and break
    number = 0
    while (number < 10) {
        number ++
        if (number == 7) {
            continue
        }
        println(number)
    }

    for (i in 0..10) {
        if (i in 3..8) {
            continue
        }
        println(i)
    }

}