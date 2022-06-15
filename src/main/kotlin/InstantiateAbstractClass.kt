/**
 *  Instantiate an abstract class in Kotlin without extend it
 */

abstract class AbstractClass {
    abstract fun doSomeThing()
    abstract fun sleep()
}

fun main() {
    val object1 = object : AbstractClass() {
        override fun doSomeThing() {
            println("Object1 doSomeThing()")
        }

        override fun sleep() {
            println("Object1 go sleep")
        }
    }

    val object2 = object : AbstractClass() {
        override fun doSomeThing() {
            println("Object2 doSomeThing()")
        }

        override fun sleep() {
            println("Object2 go sleep")
        }
    }

    object1.doSomeThing()
    object1.sleep()

    object2.doSomeThing()
    object2.sleep()
}