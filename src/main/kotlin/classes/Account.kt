package classes

class Account constructor (
    val accountNumber: String,
    val accountOwner: String,
    private var balance: Double = 0.0
) {
    constructor() : this("", "") {
        println("constructor()")
    }

    fun deposit(amount: Double) {
        balance += amount
    }

    fun deposit(amount: Int) {
        balance += amount
    }

    fun print() {
        println("Number: $accountNumber; Owner: $accountOwner")
    }
}