package nullable

/*
    Operador: Not Null Assertion Operator
    Ele deve ser evitado ao máximo.
    Vc está basicamente tirando o compilador da frente e assumindo a responsabilidade que aquela variável
    nunca irá receber um valor nulo. Caso contrário é lançado uma NullPointerException.
 */

fun main() {

    val s: String? = "abcde"
    val i = s!!.reversed()

    println(i)
}
