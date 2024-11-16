package polimorfismo

fun main() {

    val c: Coffe = Coffe()
    c.prepare()
}

open class Drink() {

    open fun prepare() {
        println("preparando DRINK")
    }

}

class Coffe: Drink() {

    override fun prepare() {
        // super.prepare()
        println("preparando COFFEE")
    }
}