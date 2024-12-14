package lambdas

fun main() {

    val x = 11

    val r = runIfTrue(x > 10) {
        println("O valor de x é $x")
        x
    }
    println(r)

}

fun runIfTrue(condition: Boolean, code: () -> Any?): Any? {
    return if (condition) {
        code()
    } else {
        null
    }
}