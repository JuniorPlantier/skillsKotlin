package lambdas

fun main() {

    val f1: (Int) -> Boolean = { it % 2 == 0 }
    val f2: (Int) -> Boolean = { n -> n % 2 == 0 }
    val f3 = { n: Int -> n % 2 == 0 }
}