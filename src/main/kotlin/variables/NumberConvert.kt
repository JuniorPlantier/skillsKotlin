package variables

fun main() {
    val i1 = 10
    val d1 = i1.toDouble()
    println(d1)

    val l1 = i1.toLong()
    println(l1)

    val d2 = 87.38
    val i2 = d2.toInt()
    println(i2) // o que vai retornar?

    val i3 = 3400
    val s1 = i3.toShort()
    println(s1) // nro inconsistente
}