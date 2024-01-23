package operators

fun main() {
    // Relaional
    println(10 == 10)
    println(10 != 7)
    println(5 > 2)
    println(5 < 2)
    println(5 >= 5)
    println(5 <= 5)

    //MixOperators
    val exp = (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)
    // 8 * 2 < 30 / 2 || !(4 <= 2)
    // 16 < 30 / 2 || !(4 <= 2)
    // 16 < 15 || !(4 <= 2)
    // F || !F
    // F || T
    // T

    println(exp)

    val exp2 = !(2 * 4 >= 16 / 2 && 5 == 4 + 1)

    // !(2 * 4 >= 16 / 2 && 5 == 4 + 1)
    // !(8 >= 8 && 5 == 5)
    // !(T && T)
    // !T
    // F

    println(exp2)

}