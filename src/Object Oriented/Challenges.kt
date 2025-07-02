package OOP

fun main(args: Array<String>) {
    val alexAccount = Account("Alex")
    alexAccount.desposit(1000)
    alexAccount.withdraw(500)
    alexAccount.desposit(-20)
    alexAccount.withdraw(-100)

    val balance = alexAccount.calculateBalance()
    println("Balance is $balance")
}

class Account(val accountName: String) {
    private var balance = 0
    private var transactions = mutableListOf<Int>()

    fun desposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now ${this.balance}")
        } else {
            println("You cannot deposit negative sums!")
        }
    }

    fun withdraw(withdrawal: Int) {
        if (-withdrawal < 0) {
            transactions.add(-withdrawal)
            this.balance += -withdrawal
            println("$withdrawal withdrawn. Balance is now ${this.balance}")
        } else {
            println("Cannot withdraw negative sums!")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0
        for (transaction in transactions) {
            this.balance += transaction
        }
        return this.balance
    }
}