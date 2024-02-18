package selection

/*
    Ele consegue trabalhar de uma forma mais facíl as ramificações.
 */
fun main() {
    val x = 20

    when (x) {
        10 -> println("É 10")
        20 -> println("É 20")
        else -> println("Desconhecido")
    }

    when (x) {
        in 0..10 -> println("De zero a dez")
        in 11..30 -> println("De onze a trinta")
        else -> println("Outro intervalo")
    }

    when (x) {
        0, 2, 4, 6 -> println("PAR")
        else -> println("Desconhecido")
    }

    val i = 10
    when {
        i > 0 -> "POSITIVO"
        i < 0 -> "NEGATIVO"
        else -> "ZERO"
    }

    val s = 'c'
    val y = when(s) {
        'a', 'b' -> 1
        'A', 'B' -> 2
        else -> 3
    }

    println(y)

    // neste caso é possível fazer outros tipos de testes, como intervalos e comparações
    val v1 = 10
    when {
        v1 > 0 -> {
            println("POSITIVO")
        }
        v1 < 0 -> println("NEGATIVO")
        else   -> println("ZERO")
    }
}