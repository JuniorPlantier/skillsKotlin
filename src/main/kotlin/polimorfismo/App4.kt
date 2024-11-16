package polimorfismo

fun main() {

}

open class Shape() {
    open val vertexNumber: Int = 0
}

class Square: Shape() {
    override val vertexNumber: Int = 4
}

class Triangle(override val vertexNumber: Int = 3): Shape()