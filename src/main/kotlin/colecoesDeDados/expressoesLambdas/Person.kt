package colecoesDeDados.expressoesLambdas

class Person(
    val nome: String,
    val idade: Int
) {

    companion object { // para podermos chamar diretamente da classe
        fun pessoasList(): List<Person> {
            return listOf(
                Person("Joaquim Plantier", 25),
                Person("Rogerio Ceni", 35),
                Person("Sergio Sacani", 44),
                Person("Fátima Pires", 15),
                Person("Fátima Pires", 15),
                Person("J.K. Rolling", 17),
                Person("Kobe Bryant", 40)
            )
        }
    }

}