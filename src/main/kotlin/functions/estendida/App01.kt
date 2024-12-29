package functions.estendida

fun main() {
    val l1 = listOf(1,2,3,4,5,6,7,8,9).sumEvenNumbers()
    println(l1)
}

fun List<Int>.sumEvenNumbers(): Int {
    return this.filter {
                it % 2 == 0
           }.sum()
}