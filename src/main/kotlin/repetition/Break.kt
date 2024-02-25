package repetition


// só pode ser usado em estrutura de repetição
fun main() {

    for (i in 0..50) {
        if (i == 20) {
            break
        }

        print("$i ")
    }

    println("FIM")
}