package classes.heranca

fun main() {
    val animal = Animal("Vermelho")
    val dog = Dog("Branco")
    val cat = Cat("Preto")

    println(dog is Dog)
    println(dog is Animal)
    
}