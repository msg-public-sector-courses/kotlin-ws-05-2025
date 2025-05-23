package group.msg.courses.kotlin_course.classes_objects.loesungen.uebung_3

// Definition der Data Class Student mit Companion Object
data class Student(val name: String, val age: Int) {
    // Companion Object für zusätzliche Funktionen oder Konstanten
    companion object {
        // Eine Funktion im Companion Object, um einen Standardstudenten zu erstellen
        fun createDefaultStudent(): Student {
            return Student("Default", 18)
        }
    }
}

fun main() {
    // Instanziierung von Studentenobjekten
    val student1 = Student("Max", 20)
    val student2 = Student("Anna", 22)

    // Aufruf der Funktion aus dem Companion Object, um einen Standardstudenten zu erstellen
    val defaultStudent = Student.createDefaultStudent()
    println(defaultStudent) // Ausgabe: Student(name=Default, age=18)
}
