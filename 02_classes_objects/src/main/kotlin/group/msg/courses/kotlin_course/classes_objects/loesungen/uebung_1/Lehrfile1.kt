package group.msg.courses.kotlin_course.classes_objects.loesungen.uebung_1

// Definition der Klasse Student mit Standardnamen
class Student(val name: String = "Max Mustermensch", val age: Int) {
    // Eine Funktion in der Klasse, die etwas über den Studenten ausgibt
    fun displayInfo() {
        println("Name: $name, Alter: $age")
    }
}

fun main() {
    // Instanzierung von Studentenobjekten
    val student1 = Student("Max", 20)
    val student2 = Student("Anna", 22)

    // Aufruf der Methode displayInfo für jedes Studentenobjekt
    student1.displayInfo()
    student2.displayInfo()
}