package pattern

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader

/**
 * Singleton Pattern:
 *   Only one instance
 *   Globally accessible
 *
 * Rules for making a class Singleton
 *      A private constructor
 *      A static reference of its class
 *      One static method
 *      Globally accessible object reference
 *      Consistency across multiple threads
 *
 * Source: https://blog.mindorks.com/how-to-create-a-singleton-class-in-kotlin
 */

object Singleton {
    var singleName = "Singleton"

    init {
        println("Singleton init with name $singleName")
    }

    fun printSingleName() {
        println("singleName current value: $singleName")
    }
}

fun main() {
    Singleton.printSingleName()

    Singleton.singleName = "Change your name"

    Singleton.printSingleName()
}