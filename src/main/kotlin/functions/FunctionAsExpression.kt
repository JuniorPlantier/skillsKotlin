package functions


/*
	Funções também podem ser expressões
Significa que uma função pode retornar outra função pra armazenar e posteriormente
    fazer uma chamada tardia nessa função num outro momento.
Isso só funciona se a função tem apenas uma expressão.
 */
fun main() {
    println(multiply(4, 6))
}

private fun multiply(a: Int, b: Int) = a * b