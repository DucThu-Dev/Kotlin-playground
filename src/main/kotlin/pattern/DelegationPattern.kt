package pattern

import com.sun.deploy.net.proxy.ProxyUtils

/**
 * Delegation Pattern
 *
 * Source: https://www.baeldung.com/kotlin/delegation-pattern
 * Use case:
 * First, we can use the delegation pattern to implement multiple interfaces using existing implementations
 * Second, we can use delegation to enhance an existing implementation.
 *
 * NOTE: Delegation Is Not Inheritance
 */

interface Producer {
    fun produce(): String
}

class ProducerImpl : Producer {
    override fun produce(): String = "ProducerImpl"
}

class EnhancedProducer(private val delegate: Producer) : Producer by delegate {
    override fun produce(): String = "${delegate.produce()} and EnhancedProduced"
}