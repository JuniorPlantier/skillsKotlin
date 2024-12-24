package colecoesDeDados

/*
Arrays, é uma classe do java utils com utilitarios para trabalhar com array.

 */
fun main() {

    //val array = Array(5) { "*" }
    val array = arrayOf("*", "*", "*", "*")

    array[0] = "A"
    array[3] = "D"
    //array[5] = "E"

    println(array.contentToString())
    println(array[0])

    // --

    val a1 = arrayOf("A", null, "C")
    val a2 = arrayOfNulls<String>(10)
    val a3 = intArrayOf(1, 2, 3) // O retorno muda, tem uma melhora na performance(economia de memória e velocidade maior). A diferença é interna.

    println(a1.contentToString())
    println(a2.contentToString())
    println(a3.contentToString())
}