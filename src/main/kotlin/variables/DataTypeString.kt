package variables

fun main() {
    val s1 = "abc"
    val s2: String = "def"

    //val s1s2 = "Soma: " + (s1+s2)
    val s1s2 = "Soma: '$s1$s2'. O tamanho é ${(s1+s2).length}"

    println(s1s2)

    /*
     * O rato roeu
     * a $roupa do
     * rei de "Roma".
     */
    val s3 = "O rato roeu\na \$roupa do\nrei de \"Roma\"."
    val s4 = """
        |  O rato roeu
        | a roupa do
        |  rei de "Roma".
        """.trimMargin()

    println(s3)
    println()
    println(s4)
}