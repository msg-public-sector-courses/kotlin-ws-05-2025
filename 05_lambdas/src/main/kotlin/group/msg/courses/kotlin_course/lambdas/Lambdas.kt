package group.msg.courses.kotlin_course.lambdas


fun lambdas() {

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    // Filtern - mit eigener Bedingung
    println(list.filter( { element -> element % 2 == 0 }) ) // Lambda-Ausdruck!

    // Lambda-Syntax
    // Lambda ist ein Funktionsliteral - keine Deklaration, sondern werden üblicherweise direkt übergeben
    val isEven: (Int) -> Boolean = { x -> x % 2 == 0 }
    val sum: (Int, Int) -> Int = { x, y -> x + y }

    // Filtern mit unserem Lambda
    list.filter(isEven)

    // ...oder ohne Deklaration
    list.filter( { x -> x % 2 == 0 } )

    // Syntax: Trailing Lambda: Wenn der letzte Parameter einer Funktion eine Funktion ist,
    // dann kann das Lambda außerhalb der runden Klammern geschrieben werden
    // ...und die runden Klammern können weg, wenn keine anderen Parameter dran sind
    list.filter() { x -> x % 2 == 0 }

    // Syntax: Impliziter Parameter it
    // Wenn nur ein Parameter im Lambda deklariert wird, muss er nicht explizit benannt werden,
    // sondern heißt implizit 'it'
    list.filter { it % 2 == 0 }

    // Chaining ähnlich zu Java Streams
    // jeder Aufruf generiert eine neue Liste, im Gegensatz zu Java. Kann u.U. Performance reduzieren
    // Sequences emulieren das Verhalten von Java an der Stelle
    val maxEvenSquare = list
        .filter(isEven)    // [2, 4, 6, 8]
        .filter { it > 2 } // [4, 6, 8]
        .map { it * it }   // [16, 36, 64]
        .max()             // 64

}


