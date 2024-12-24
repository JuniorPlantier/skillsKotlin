package colecoesDeDados

fun main() {
    // conjuntos tem como caracteristica não armazenar valores duplicados

    val s1 = setOf(1, 2, 3, 4, 4 ,4 ,4 ,4 ,4 ,4) // mantem a ordem de inserção
    val s2 = mutableSetOf("A", "B", "C")
    val s3 = hashSetOf("1A", "5B", "10C") // nao mantem a ordem de inserção

    s1.forEach { println(it) }
    s2.forEach { println(it) }
    s3.forEach { println(it) }
}