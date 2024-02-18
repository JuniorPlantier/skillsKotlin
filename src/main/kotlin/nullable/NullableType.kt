package nullable


/* No Kotlin o null é tratado de uma forma especial.
   Os nullableTypes são os mesmos tipos que conhecemos, porém seguidos com um ponto de interrogação.
   Ao declarar a variável com o ponto, estamos dizedo que essa variável pode receber o null, como valor.

   Toda vez que vc quiser permitir que um valor nulo seja atribuido a uma variável, é necessário usar esse recurso.
 */

fun main() {

    var n: Int = 10
    n = 20
    //n = null // Não é permitido

    var x: Int? = 10
    x = 20
    x = null // Não é permitido

}