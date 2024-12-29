package colecoesDeDados.expressoesLambdas

fun main() {
    Person
        .pessoasList()
        .filter{ it.idade > 25 }
        .forEach {
            println(it)
        }
}