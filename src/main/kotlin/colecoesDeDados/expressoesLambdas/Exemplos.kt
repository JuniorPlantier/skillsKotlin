package colecoesDeDados.expressoesLambdas

fun main() {

    // distinct e sorted
    val p1 = Person
        .pessoasList()
        .map{ it.idade }
        .distinct()
        .sorted()
        .forEach {
            println(it)
        }

    // retorna elementos randorizados
    val p2 = Person
        .pessoasList()
        .map{ it.nome }
        // .randomOrNull() // qdo é preciso retornar apenas 1 elemento
        .shuffled() // emaralha os elementos e retorna uma lista embaralhada
        .take(3) // pega os 3 primeiros elementos
        .forEach {
            println(it)
        }

    // transformando a lista em map
    val p3 = Person
        .pessoasList()
        .associate { Pair(it.nome, it.idade) }
        .forEach { (n, i) ->
            println("$n -> $i")
        }

    // groupBy
    val p4 =    Person
        .pessoasList()
        .groupBy { it.nome[0] } // .groupBy({ it.nome[0] }, { it.nome })
        .forEach { (k, v) ->
            println("$k -> $v")
        }

}