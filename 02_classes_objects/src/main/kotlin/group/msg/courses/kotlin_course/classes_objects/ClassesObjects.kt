package group.msg.courses.kotlin_course.classes_objects

import java.util.*


// Klassendefinition

// PascalCase ist Konvention
// Klasse -> Bauplan für Objekte (vllt abfragen)
class MyClass {

}

//...mit Konstruktor (default werte) - "constructor" key word kann weggelassen werden
class MyClass2 constructor(property1: String, property2: Int = 42)

//...mit init block für codeausführung beim instanzieren
class PersonProperty(property1: String, geburtsdatum: Date) {

    val name = property1
    init {
        println("Ich bin jetzt auch da!")
    }
}

// ... shorthand für property declaration + default wert
class Person(var name: String, val geburtsdatum: Date = Date()) {


    // mehrere Konstruktoren - muss Primärkonstruktor aufrufen!
    constructor(person: Person) : this(person.name, person.geburtsdatum) {
        // hier kann auch noch code stehen
    }
}

// Instanzieren - wie Java nur ohne new
val person = Person("Dominik")
val person2 = Person(person)

// Zugriff auf properties per propertyzugriff, keine get / set methoden

// abstract classes - keine instanz möglich
abstract class Polygon {
    abstract fun draw()
}

// Subklasse : statt extends
// Genau eine Oberklasse möglich - ohne direkte Oberklasse erbt jede Klasse von Any
open class Rectangle : Polygon() {

    // methoden überschreiben
    override fun draw() {
        // draw the rectangle
    }
}

// Klassen sind final by default; Keyword open
class Square : Rectangle() {
    override fun draw() {}
}


// interfaces - speichert keinen State, stellt nur methoden bereit (abstract oder implementiert)
// implementierende Klasse muss Methode implementieren
// Klasse kann mehrere Interfaces implementieren
// Interfaces können voneinander erben
interface Drawing {
    abstract fun draw()
}

interface AsciiDrawing: Drawing {
    abstract fun drawOnConsole()
}

// Visibility modifiers - public by default
class Stuff {
    public val publicValue: Int = 0
    val publicValue2: Int = 1
    internal val moduleWideValue: Int = 2 // ähnlich zu "kein modifier" in java, also package private
    protected val subclassesCanSeeThisValue = 3
    private val myOwnValue = 4
}

// data classes - POJOS made simple
// generiert automatisch
// - equals()/hashCode() pair.
// - toString() of the form "User(name=John, age=42)".
// - componentN() functions corresponding to the properties in their order of declaration.
// - copy() function.
data class User(val name: String, val age: Int)

// object declaration - singletons
object MyCentralService {
    fun fetchUser(): User {
        println("procesing...")
        return User("test", 1)
    }
}

// companion objects
class RestController {

    companion object {
        val GET_ENDPOINT_USERS = "/users"
        fun create(): RestController {
            return RestController()
        }
    }
}

// Extensions: Fertige Klassen erweitern
// ... um Methoden
fun String.capitalize() = this.first().uppercase() + this.substring(1)

// ... um properties
val String.isCapitalized: Boolean get() = this.first().isUpperCase()
val <T> List<T>.lastIndex: Int get() = size - 1


fun main() {
    // property zugriff
    println(person.name)

    // copying
    val user = User("name", 1)
    val user2 = user.copy(name = "neuer name")

    // object declaration
    MyCentralService.fetchUser()

    // companion object
    println(RestController.GET_ENDPOINT_USERS)
    val controller = RestController.create()
}