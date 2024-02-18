package properties

fun main() {

    val account = Account(100.0)

    account.deposit(1000.0)
    account.withdraw(100.0)
    account.withdraw(500.0)

    println(account.balance)
}

class Account(balance: Double = 0.0) {

    init {
        require(balance >= 0)
    }

    var balance: Double = balance
        private set

    fun deposit(amount: Double) {
        require(amount >= 0)
        balance += amount
    }

    fun withdraw(amount: Double) {
        require(amount >= 0)
        balance -= amount
    }
}