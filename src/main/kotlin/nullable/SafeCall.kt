package nullable

/*
    A partir do momento que uma variável pode receber nulo causa uma situação problematica que
       o Kotlin tenta resolver.
    No java, por exemplo, ao fazer uma chamada para alguma variável que a referência é nula,
       é retornado um NullPointerException durante a execução.

    O Kotlin força vc a utilizar esse recurso - safeCall
    A chamada da variável é alterada, é preciso incluir o operador "?."
*/

fun main() {

    //val s1: String? = "abcde"
    val s1: String? = null
    println(s1)

    val s2 = s1?.uppercase()
    println(s2)

    val s3 = s2?.reversed()
    println(s3)

    val l = s3?.length
    println(l)



    // Smart Cast
    val s20: String? = null

    if (s20 != null) {
        println(s20)

        val s21 = s20.uppercase()
        println(s2)

        val s22 = s21.reversed()
        println(s3)

        val l = s22.length
        println(l)
    }
}