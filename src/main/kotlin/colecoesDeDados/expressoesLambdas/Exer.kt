package colecoesDeDados.expressoesLambdas

/*
    1) qual é o maior preço?
    2) qual o produto com o preço mais barato?
    3) qual é a lista de produtos cujo o preço é menor que $5?
 */

fun main() {
    val produtos = mapOf(
        "verdura" to 4.9,
        "carne" to 19.99,
        "frango" to 15.0,
        "sal" to 2.65,
        "banana" to 4.99,
        "arroz" to 6.0
    )

    // 1
    println(
        produtos.maxByOrNull { it.value }
    )

    // 2
    println(
        produtos.minBy { it.value }.key
    )

    // 3
    produtos
        .filter { it.value < 5.0 }
        .keys
        .forEach {
            print("$it - ")
        }
}