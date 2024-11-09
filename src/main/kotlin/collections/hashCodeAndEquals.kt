package collections

fun main() {

    val dogs = setOf(
        Dog("D1"),
        Dog("D2"),
        Dog("D2"),
        Dog("D3"),
        Dog("D4"),
        Dog("D4")
    )

    println(dogs)
}
/* ddddd
*
* */
data class Dog(val name: String) {
    override fun toString() = "Dog(name=$name, hashCode=${hashCode()})"

//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Dog
//
//        if (name != other.name) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        return name.hashCode()
//    }

}