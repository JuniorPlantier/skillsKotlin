package repetition

fun main() {
    print("> ")
    val n = readln().toInt()

    var i = 1
    val m = 15

    while(i <= m) {
        println("$n x $i = ${n * i++}")
    }

}