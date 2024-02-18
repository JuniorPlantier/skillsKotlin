package nullable

fun main() {

    val value: Int? = 10

    //val value2 = if (value != null) value else 0 // sem Elvis Operador
    //println(value2)

    val value2 = value ?: 0 // com Elvis Operador
    println(value2)

    /**
     * Escreva um programa que solicita um número a um usuário, multiplica ele por 2 duas vez e subtrai 10. Se o usuário
     * digitar algo que não possa ser convertido em um número, o número 2 deve ser assumido como padrão.
     * O programa deve calcular o valor do número e mostrá-lo na tela em uma única expressão.
     */
    println(
        readln()
            .toIntOrNull()
            ?: 2
                .times(2)
                .times(2)
                .minus(10)
    )

    /**
     * Escreva um programa que mascara uma senha, substituindo seus caracteres por '*'. Se a senha for nula, a senha
     * '1234' deve ser usada, a qual deve ser mascarada depois.
     */
    val password: String? = null
    val defaultPassword = "1234"

    val mask = "".padEnd((password ?: defaultPassword).length, '*')

    println(password)
    println(mask)
}