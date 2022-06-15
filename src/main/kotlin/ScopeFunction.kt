/**
 * Demonstrate how to use scope function
 * run, let, apply, also, with
 * Source: https://stackoverflow.com/questions/45977011/example-of-when-should-we-use-run-let-apply-also-and-with-on-kotlin
 */

fun main() {
//    runExample()
//    applyExample()
    letExample()
}

class Student(val name: String = "Duc Thu", var age: Int = 22) {
    fun sing() {
        println("La la la la la la la la")
    }

    override fun toString(): String {
        return "$name is $age years old"
    }
}

/**
 * [run] - returns anything you want and re-scopes the variable it's used on to [this]
 *
 */
fun runExample() {
    val num = Student().run {
        println("${this.name} is $age years old")
        sing()
        555
    }

    println("run result: $num")
}

/**
 * [apply] apply things and return itself ([this])
 * useful as replace builder pattern
 */
fun applyExample() {
    val student = Student().apply {
        age = 30
        sing()
    }

    println("apply result: $student")
}

/**
 * [let] - mostly used to avoid null checks, but can also be used as a replacement for [run]
 */
fun letExample() {
    val student = Student()
    student.let {
        it.age = 30
        println("In the let scope: ${it.toString()}")
    }

    println("student instance: $student")

    println("After run let, student is: $student")
}

/**
 * [also] - use it when you want to use apply, but don't want to shadow [this]
 */

