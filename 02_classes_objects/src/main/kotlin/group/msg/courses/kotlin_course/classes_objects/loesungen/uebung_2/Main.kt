package group.msg.courses.kotlin_course.classes_objects.loesungen.uebung_2

fun main() {
    val person1 = Person("Regina", 20, "Schmied")
    val person2 = Person("Rainer", 30, "Bäcker")
    val person3 = person2.copy(name = "Uwe")
}