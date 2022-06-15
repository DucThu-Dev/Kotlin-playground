fun main() {
    checkCollectionBehavior()
}

val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

fun checkCollectionBehavior() {
    val subtractResult = numbers.subtract(listOf(1, 2, 3))
    println("Subtract result: $subtractResult")

    val sorted = numbers.sortedDescending()
    println("Numbers: $numbers")
    println("Numbers sorted: $sorted")

    val sum = numbers.run {
        fold(0) {
            acc, value -> acc + value
        }

        555
    }
    println("Sum after run: $sum")
}