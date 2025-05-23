package group.msg.courses.kotlin_course.classes_objects.loesungen.uebung_5

fun Int.isPositive(): Boolean { return this > 0 }

val Int.positive: Boolean get() = this > 0
fun main() {
    println(1.isPositive())
    println(0.isPositive())
    println((-1).isPositive())

    println(1.positive)
    println(0.positive)
    println((-1).positive)
}