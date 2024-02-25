package repetition

// esse tipo de recurso é ineressante qdo temos um loop dentro de outro

fun main() {

    row@ for (i in 'A'..'E') {
        for (j in 1..5) {
            print("$i$j ")

            if (j == 3) {
                //break@loop
                continue@row
            }
        }
        println()
    }

    println("\nFIM")
}