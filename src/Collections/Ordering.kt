package Collections

fun main(args: Array<String>) {
    val numbers = mutableListOf(2, 5, 1, 40, 20, 100, 60)
    numbers.sorted().forEach { println(it) }

    val laptops = mutableListOf(
        Laptop("Dell", 2021, 6, 600),
        Laptop("Acer", 2020, 4 , 800),
        Laptop("Apple", 2022, 16, 1000),
        Laptop("Toshiba", 2024, 8, 700)
    )

    println("\n")
    laptops.sortedBy { it.price }.forEach { println(it) }
    println("\n")
    laptops.sortedWith(compareBy<Laptop> { it.ram }).forEach { println(it) }
    laptops.sortedBy { it.ram }.forEach { println(it) } // it gives us the same result
    println("\n")
    laptops.sortedWith(compareBy<Laptop> {it.year}.thenBy {it.price}.thenBy { it.ram }).forEach { println(it) }
    println("\n")
    laptops.sortedWith(ComparatorPrice()).forEach { println(it) }
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int) : Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        if (this.price > other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
            return 1
        } else if (this.price < other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
            return -1
        } else {
            return 0
        }
    }
}

class ComparatorRam: Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.ram > laptop2.ram) {
            1
        } else if (laptop1.ram < laptop2.ram) {
            -1
        } else {
            return 0
        }
    }
}

class ComparatorYear: Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.year > laptop2.year) {
            1
        } else if (laptop1.year < laptop2.year) {
            -1
        } else {
            return 0
        }
    }
}

class ComparatorPrice: Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.price > laptop2.price) {
            1
        } else if (laptop1.price < laptop2.price) {
            -1
        } else {
            return 0
        }
    }
}