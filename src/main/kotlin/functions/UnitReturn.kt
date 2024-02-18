package functions

/*
	Os tipos de retorno Unit e Nothing

Qdo não é especificado o tipo de retorno, por padrão existe um tipo de retorno o tipo Unit.
Então, esse tipo Unit é um tipo de retorno que não retorna nada.

Nothing: significa que realmente ela não retorna nada, significa que obrigatóriamente ela lança um exceção.

Lembrando que ambas não retornam nada.
 */

fun main() {

    val r = doSomething()
    println(r)

    TODO()
}

private fun doSomething() {

}