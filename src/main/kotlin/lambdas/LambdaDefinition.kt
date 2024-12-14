package lambdas

fun main() {
    val f1: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(f1)
    println(f1(74, 52))


}