package selection

/**
 * Implemente uma calculadora capaz de executar as 4 operações básicas e que recebe os dados via teclado.
 */

fun main() {

    print("> ")
    val v1 = readln().toDouble()

    print("> ")
    val op = readln()[0] // retorna um Char

    print("> ")
    val v2 = readln().toDouble()

    val r = when (op) {
        '+' -> v1 + v2
        '-' -> v1 - v2
        '*' -> v1 * v2
        '/' -> v1 / v2
        else -> 0
    }

    println("Resultado: $r")
}