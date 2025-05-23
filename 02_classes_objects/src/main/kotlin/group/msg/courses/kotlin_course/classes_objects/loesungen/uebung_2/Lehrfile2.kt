package group.msg.courses.kotlin_course.classes_objects.loesungen.uebung_2


// Definition der Data Class Student
data class Student(val name: String, val age: Int)

fun main() {
    // Instanziierung von Studentenobjekten
    val student1 = Student("Max", 20)
    val student2 = Student("Anna", 22)

    // Vorgenerierte Funktionen für Data Classes:
    // 1. toString() - gibt eine lesbare String-Repräsentation der Objekte aus
    println(student1.toString()) // Ausgabe: Student(name=Max, age=20)
    println(student2.toString()) // Ausgabe: Student(name=Anna, age=22)

    // 2. equals() - vergleicht zwei Objekte auf Gleichheit anhand ihrer Eigenschaften
    println(student1 == student2) // Ausgabe: false

    // 3. copy() - erstellt eine Kopie eines Objekts mit optionalen Änderungen
    val student3 = student1.copy(name = "John")
    println(student3) // Ausgabe: Student(name=John, age=20)
}
