package classes

fun main() {
    val a1: Account = Account("1235-5", "Lina Cachorrinha")
    val a2 = Account("5648-5", "Joaquim Plantier")

    a1.deposit(2000.0)
    a2.deposit(150.0)

    a1.print()

    var g = CharGenerator(min = 'A', max = 'Z')
    println(g.next())
    println(g.next())
    println(g.next())
}

class CharGenerator(
    val min: Char,
    val max: Char
) {

    fun next(): Char {
        return (min..max).random()
    }
}