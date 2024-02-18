package functions

fun main() {
    sayHello("Calleri", 27.0)
    sayHello("Arboleda", 33.7)
}

private fun sayHello(name: String, temperature: Double) {
    // name = "Carlos" // erro! parametros é readOnl
    println("Hi, $name! Temperature is $temperature degress.")
}

/*
	Parâmetros
É um dado que a função recebe. E é defino no mesmo formato da variável
    nomePara: tipoDeDado
Fica visível apenas dentro da função.
É uma constante, não é possível alterar o valor é read-only.

A chamada da função muda.
Funções podem ou nao ter parametros.

Internamente o valor da variável passada é copiado para o parâmetro.
 */