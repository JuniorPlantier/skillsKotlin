package polimorfismo

fun main() {

    val p: Programmer = Programmer()
    p.work()

    val t: Teacher = Teacher()
    t.work()
}

abstract class Employee() {

    abstract fun work()
}

class Programmer: Employee() {

    override fun work() {
        println("Programmer working...")
    }
}

class Teacher: Employee() {
    
    override fun work() {
        println("Teacher working...")
    }
}