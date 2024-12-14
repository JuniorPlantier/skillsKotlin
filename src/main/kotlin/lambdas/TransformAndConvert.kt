package lambdas
// High-order functions
fun main() {

    val r1 = transformAndConvert("$", "|", 24, {v -> v * v})
    println(r1)

    // trailing lambdas: só funciona qdo a expressão lambda é o último parametro
    val r2 = transformAndConvert("$", "|", 24) {v -> -v}
    println(r2)
}

fun transformAndConvert(prefix: String, suffix: String, value: Int, t: (Int) -> Int): String {
    val transformed = t(value)
    return "$prefix$transformed$suffix"
}