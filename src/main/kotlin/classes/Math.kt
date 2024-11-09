package classes

fun main() {

    Math.sum(20, 10)
    Math().substract(52, 23)
}

class Math {

    fun substract(a: Int, b: Int) = a - b

    companion object {
        fun sum(a: Int, b: Int) = a + b
    }
}