package polimorfismo

fun main() {

    val a: Programmer = Programmer()
    a.work()

    val b: KotlinProgrammer = KotlinProgrammer()
    b.work()

    // Qual é o tipo do objeto que está na memória?
    // Com base no que está na memória o seu objeto se comporta de forma diferente.
    var c: Programmer = KotlinProgrammer()
    c.work()

    c = Programmer()
    c.work()
}

abstract class Employee() {

    abstract fun work()
}

open class Programmer: Employee() {

    override fun work() {
        println("Programmer working...")
    }
}

class KotlinProgrammer: Programmer() {

    override fun work() {
        println("Kotlin Programmer working...")
    }
}

class Teacher: Employee() {

    override fun work() {
        println("Teacher working...")
    }
}