package lambdas

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val g1 = newGenerator(0, 10)
    repeat(10) {
        print("${g1()} ")
    }

    println()

    val g2 = newGenerator(11, 20)
    repeat(10) {
        print("${g2()} ")
    }
}

fun newGenerator(min: Int, max: Int): () -> Int {
    return { Random.nextInt(min..max) }
}