package functions.anonima

fun main() {

    val f1 = fun(n1: Int, n2: Int): Int {
        return n1 + n2
    }
    println(f1)
    println(f1.invoke(15, 9))
    println(f1(87, 69))

}

