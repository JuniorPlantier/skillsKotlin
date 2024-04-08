package collections

fun main() {

    val l1: List<String> = listOf("A", "B", "C")
    val l2: MutableList<String> = l1.toMutableList()

    val s1: Set<String> = l1.toSet() // os elementos duplicados são eliminados.
    val s2: MutableSet<String> = s1.toMutableSet()
    val s3: MutableSet<String> = s2.toMutableSet()
    /*
        Efeito colateral
        Usar métodos toXxx, permite criar cópias de listas, tornando as listas independentes.
     */
}