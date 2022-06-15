/**
 * https://www.baeldung.com/kotlin/fold-vs-reduce
 */

fun main() {
//    reduceFoldDiff()
//    splitEvenOdd()
    listSum()
}

/**
 * Different reduce and fold
 */
fun reduceFoldDiff() {
    val numbers = listOf(1, 2, 3)

    /**
     *  If [numbers] empty, throw RuntimeException
     */
    val sumReduce: Int = numbers.reduce { acc, num ->
        acc + num
    }

    /**
     *  Has initial value
     *  If [numbers] empty, return initial value
     */
    val sumFold: Int = numbers.fold(5) { acc, num ->
        acc + num
    }

    println("Reduce result: $sumReduce")
    println("Fold result: $sumFold")

}

/**
 * Fold: split even and odd
 */
fun splitEvenOdd() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val (even, odd) = numbers.fold(Pair(listOf<Int>(), listOf<Int>())) { acc, next ->
        if (next % 2 == 0) Pair(acc.first, acc.second + next) else Pair(acc.first + next, acc.second)
    }

    println("List of even: $even")
    println("List of odd: $odd")
}

fun listSum() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6)

    val list = list2 + list1

    println("Result:$list")
}