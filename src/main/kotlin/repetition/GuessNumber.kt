package repetition

import kotlin.random.Random

/**
    Tente advinhar o nro
 */
fun main() {

    val secret = Random.nextInt(0, 101)

    while (true) {
        print("> ")
        val n = readln().toInt()

        when {
            n > secret -> println("O número sorteado é menor")
            n < secret -> println("O número sorteado é maior")
            else -> {
                println("PARABÉNS! Você acertou o número, que era $n")
                break
            }
        }
    }
}