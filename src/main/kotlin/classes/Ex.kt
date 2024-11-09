package classes

fun main() {
    val p1 = Person()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.drinkWater()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk() // 6
    p1.drinkWater()

    println("A pessoa01 andou ${p1.end()}")

    var p2: Person = Person(1000)
    p2.walk()
    p2.walk()
    p2.walk()
    p2.drinkWater()
    p2.walk()
    p2.walk()

    println("A pessoa02 andou ${p2.end()}")
}

private class Person(
    private var initialDistanceToWater: Int = 5000
) {
    private var distance = 0
    private var distanceToWater: Int = 5000

    fun walk() {
        if (distanceToWater > 0) {
            distance += 1000
            distanceToWater -= 1000
        }
    }

    fun drinkWater() {
        distanceToWater = initialDistanceToWater
    }

    fun end(): Int {
        return distance
    }
}