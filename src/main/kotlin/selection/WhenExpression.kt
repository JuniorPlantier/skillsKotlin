package selection


fun main() {

    // isso significa q o when pode retornar um valor
    val v1 = 10

    val s = when {
        v1 > 0 -> "POSITIVO"
        v1 < 0 -> "NEGATIVO"
        else   -> "ZERO"
    }

    val j = 'A'

    val i = when(j) {
        'A', 'a' -> 1
        'B', 'b' -> 2
        else -> 3
    }

}