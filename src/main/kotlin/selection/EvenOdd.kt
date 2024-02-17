package selection

fun main() {
    print("> ")
    val x = readln().toInt()

    val type = if(x % 2 == 0) {
        "PAR"
    } else {
        "ÍMPAR"
    }

    println("O nro é $type")
}