package properties

/*
Properties
A propriedade é como se fosse um variável que está dentro de uma classe/objeto
field => toda propriedade internamente tem um backing field que é um local na memória
   onde ela fica armazenada, é no backing field que vc está buscando/alterando a propriedade.

na propriedade "val" nao tenho um setter
 */

fun main() {
    val r1 = Rectangle(10, 30)
    println(r1.width)
    println(r1.height)
    println(r1.surface)
}

class Rectangle(
    width: Int, height: Int
) {

    var width: Int = width
        private set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var height: Int = height
        private set

    val surface
        get() = width * height
    // nessa execução não existe backingfield
}