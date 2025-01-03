package colecoesDeDados

/*
    varargs, é a mesma coisa que trabalhar com arrays.
    spread operator(*), ele espalha os valores.
*/

fun main() {

    println(sum(2, 5, 10, 3, 4, 5, 6))

    val a = intArrayOf(2, 5, 7, 2, 1, 7)
    println(sum(*a)) // spread operator
}

//fun sum(n1: Int, n2: Int): Int {
//    return n1 * n2
//}

fun sum(vararg values: Int): Int {
    var sum = 0
    values.forEach { sum += it }
    return sum
}