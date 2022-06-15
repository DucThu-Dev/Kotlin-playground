package pattern

/**
 * Source: https://www.baeldung.com/kotlin/decorator-pattern
 *
 * The Decorator Pattern is a design pattern that allows adding new functionality
 * to an existing object without altering its structure and without affecting the
 * behavior of other objects from the same class.
 *
 * The Decorator pattern allows us to add behavior either statically or
 * dynamically by providing an enhanced interface to the original object
 */

fun main() {
    val artifact = AnimalDecorator(DrawDecorator(ColorDecorator(Artifact())))
    println(artifact.decorate())
}

interface Picture {
    fun decorate() : String
}

class Artifact : Picture {
    override fun decorate(): String {
        return "This is a artifact, really awesome"
    }
}

abstract class PictureDecorator(private val picture: Picture) : Picture {
    override fun decorate(): String {
        return "${picture.decorate()}${selfDecorate()}"
    }

    abstract fun selfDecorate(): String
}

class ColorDecorator(picture: Picture) : PictureDecorator(picture) {
    override fun selfDecorate(): String {
        return ", with beautiful color"
    }
}

class DrawDecorator(picture: Picture) : PictureDecorator(picture) {
    override fun selfDecorate(): String {
        return ", with awesome draw"
    }
}

class AnimalDecorator(private val picture: Picture) : Picture by picture {
    override fun decorate(): String {
        return "${picture.decorate()}, with Animal, too"
    }
}