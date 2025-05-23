package group.msg.courses.kotlin_course.classes_objects.loesungen.uebung_4

open class Shape {
    open fun draw() {
        println("Drawing shape.")
    }
}

class Circle : Shape() {
    override fun draw() {
        println("Drawing a circle.")
    }
}

class Square : Shape() {
    override fun draw() {
        println("Drawing a square.")
    }
}

fun main() {
    val shape1: Shape = Circle()
    val shape2: Shape = Square()

    shape1.draw()
    shape2.draw()
}