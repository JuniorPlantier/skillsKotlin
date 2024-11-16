package polimorfismo

fun main() {
    val a: Animal = Dog()
    a.eat()

    if(a is Dog) {
        a.run()
        val b = a as Dog
    }

}

open class Animal() {

    fun eat() {
        println("eating...")
    }
}

class Dog: Animal() {

    fun run() {
        println("runnning...")
    }
}

class Cat: Animal() {

    fun sleep() {
        println("sleeping...")
    }
}