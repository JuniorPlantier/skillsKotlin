package exceptions

import java.lang.RuntimeException

/*
    Você trata e relança a exceção com outro tipo.
    Utilizado normalmente qdo vc quer esconder exceções, sem expor as informações.

    Lançar uma exceção passando uma origem - causedBy (cause)
    Na causa vc consegue visualizar a origem.
 */

fun main() {
    a()
}

fun a() {
    try {
        b()
    } catch (b: B) {
        throw A(b)
    }
}

fun b() {
    throw B()
}

class A(cause: Throwable) : RuntimeException(cause)
class B : RuntimeException()