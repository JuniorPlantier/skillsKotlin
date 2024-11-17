package polimorfismo

// classes anônimas

fun main() {

    val v = object: Vehicle {
        override fun drive() {
            println("Driving...")
        }
    }
    v.drive()
}

interface Vehicle {

    fun drive()
}