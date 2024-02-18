package properties

fun main() {

    val s1 = Square(10)
    val s2 = Square(10)
    val s3 = Square(10)
}

/*
        blocos de inicialização - initialization blocks
    o init é um bloco que nao tem parâmetros
    ele é chamado automaticamente toda vez que a classe é instânciada
      local ideal para validação de dados

    pode ser definido multiplas vezes
      a ordem de chamada é sempre definida no arquivo
 */

class Square(val size: Int) {

    init {
        println("init1")
        require(size > 0)
    }

    init {
        println("init2")
    }
}