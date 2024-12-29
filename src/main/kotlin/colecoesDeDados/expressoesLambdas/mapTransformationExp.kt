package colecoesDeDados.expressoesLambdas

fun main() {
    /*  o map, recebe como parâmetro o elemento da coleção e retorna uma nova lista com os elementos.
        neste exemplo eu tinha uma lista do tipo Person e agora tenho uma lista de String
     * */

    val pessoas = Person
            .pessoasList()
            .map {
                it.nome
            }
}