package pattern

/**
 * Observer Pattern
 *
 * The pattern shows the definition of a subscription mechanism that notifies multiple
 * objects about any changes that happen to the observed object.
 *
 * Source: https://www.baeldung.com/kotlin/observer-pattern
 */

fun main() {
    val person1 = Person("Duc Thu")
    val person2 = Person("Gulliver")

    val newsPoster = NewsPoster()
    newsPoster.notifyObserves("I just initial!")

    newsPoster.addObserve(person1)
    newsPoster.addObserve(person2)

    newsPoster.notifyObserves("Hey, we just have 2 user!")

    newsPoster.removeObserve(person2)

    newsPoster.notifyObserves("This is the Observer patter")
}

interface Observer {
    fun update(message: String)
}

interface Observable {
    fun addObserve(observer: Observer)
    fun removeObserve(observer: Observer)
    fun notifyObserves(message: String)
}

class NewsPoster : Observable {
    private val observers = mutableListOf<Observer>()

    override fun addObserve(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserve(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObserves(message: String) {
        println("Receive new message! Everyone listen it!")
        observers.forEach {
            it.update(message)
        }
    }
}

class Person(private val name: String) : Observer {
    override fun update(message: String) {
        println("$name receive new message: $message")
    }
}
