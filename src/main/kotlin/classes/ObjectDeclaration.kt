package classes

fun main() {
    println(Math2.pi)
    println(Math2.sum(52, 69))
}

object Math2 {

    val pi: Double = 3.1415

    fun sum(n1: Int, n2: Int) = n1 + n2
}