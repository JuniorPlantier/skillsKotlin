package colecoesDeDados

import java.util.*

fun main() {

    val dogs = setOf(
        Dog2("D1"),
        Dog2("D1"),
        Dog2("D2"),
        Dog2("D3"),
        Dog2("D4"),
        Dog2("D4"),
    )
    println(dogs)
}

class Dog2(private val name: String) {
    override fun toString() = "Dog(nome=$name, hashCode=${hashCode()})"

    override fun hashCode(): Int {
        return Objects.hash(name)
    }

    override fun equals(other: Any?): Boolean {
        return if(other is Dog) {
            this.name == other.name
        } else {
            false
        }

    }
}

// aqui o Kotlin já faz tudo isso
data class Dog3(private val name: String) {
    override fun toString() = "Dog(nome=$name, hashCode=${hashCode()})"
}