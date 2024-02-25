package repetition


// só pode ser usado em estrutura de repetição
fun main() {

    for (i in 0..50) {

        if (i % 10 == 0) {
            continue
        }

        print("$i ")
    }
}