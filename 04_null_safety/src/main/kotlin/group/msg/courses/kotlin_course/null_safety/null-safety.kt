package group.msg.courses.kotlin_course.null_safety

import kotlin.random.Random

fun main() {
    var name: String? = null
    name = newNameOrNull()

    println("Name ist: $name")

    // Null-Check mit if
    if (name != null) {
        println("Name ist: $name")
        println("Name ist: ${name.length}")
    }

    // Safe Call
    val length = name?.length
    println("Länge: $length")

    // Elvis Operator
    val displayName = name ?: "Unbekannt"
    println("Anzeigename: $displayName")

    // Not-Null Assertion
    val forcedLength: Int = name!!.length
    println("Erzwungene Länge: $forcedLength")
}

fun newNameOrNull() =
    if (Random.nextFloat() < 0.5) {
        "Kotlin"
    } else {
        null
    }