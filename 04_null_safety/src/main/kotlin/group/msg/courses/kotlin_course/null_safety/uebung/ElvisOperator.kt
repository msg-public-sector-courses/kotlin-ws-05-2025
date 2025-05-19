package group.msg.courses.kotlin_course.null_safety.uebung

import kotlin.random.Random

fun maybeGreet(): String? {
    return if (Random.nextFloat() < 0.5) {
        "Hello from Kotlin!"
    } else {
        null // not in the mood for greeting right now
    }
}

fun elvisOperatorTask() {
    val greeting = maybeGreet()

    // TODO: Make me use the elvis operator!

    if (greeting != null) {
        println(greeting)
    } else {
        println("Kotlin mag heute nicht.")
    }


    //Lösung: println(greeting ?: "Kotlin mag heute nicht.")
}

fun main() {
    elvisOperatorTask()
}