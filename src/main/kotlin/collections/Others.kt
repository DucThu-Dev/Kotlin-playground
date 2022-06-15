package collections

/**
 * https://www.baeldung.com/kotlin/mutable-collection-to-immutable
 * https://www.baeldung.com/kotlin/iterate-over-jsonarray
 * https://www.baeldung.com/kotlin/collections-remove-duplicates
 * https://www.baeldung.com/kotlin/map-vs-flatmap
 * https://www.baeldung.com/kotlin/copy-list
 * https://www.baeldung.com/kotlin/arraylist-vs-mutablelistof
 * https://www.baeldung.com/kotlin/aggregate-operations
 * https://www.baeldung.com/kotlin/sequences
 */

fun main() {
//    removeDuplicateElement()
    mapVsFlatMap()
}

fun removeDuplicateElement() {
    val toys = listOf("car", "bupbe", "train", "plane", "car", "train")
    val distinct = toys.distinct()

    println("Toys is: $toys")
    println("Distinct is: $distinct")
}

data class Order(val lines: List<OrderLine>)
data class OrderLine(val name: String, val num: Int)

fun mapVsFlatMap() {
    val orders = listOf(
        Order(listOf(OrderLine("Garlic", 1), OrderLine("Chives", 2))),
        Order(listOf(OrderLine("Tomato", 1), OrderLine("Garlic", 2))),
        Order(listOf(OrderLine("Potato", 1), OrderLine("Chives", 2))),
    )

    val lines = orders.flatMap { it.lines }
    println("lines is: $lines")

    val names = lines.map { it.name }

    println("names is: $names")
}