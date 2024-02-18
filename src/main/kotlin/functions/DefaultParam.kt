package functions

fun main() {
    sayHello2(message = "Tudo bem?")
}

private fun sayHello2(name: String = "Desconhecido", message: String) {
    println("Hi, $name! $message")
}

/*
Colocando um DefaultParam
  é uma forma do parâmetro assumir um valor padrão
  faz com que na chamada da função desse parâmetro não seja obrigatório
cuidado: na ordem da passagem dos parâmetros, dependendo da posição do valor default
         o compilador pode se perder.
         Para resolver esse problema defina os valores defaults sempre no final ou
         então usar os parâmetros com o nome.
 */