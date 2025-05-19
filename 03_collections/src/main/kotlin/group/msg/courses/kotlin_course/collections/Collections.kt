package group.msg.courses.kotlin_course.collections

fun collections() {
    // Ziel: Collection-API kennenlernen, möglichst wenig selber bauen.

    // Java: var list = List.of(1, 2, 3) - kann nur bis zu 10 Elemente
    // Listen, Sets: gemeinsames Interface Collections
    // Maps und Arrays sind extra
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8) // Listen: Geordnet, Duplikate möglich
    val set = setOf(1, 4, 8) // Sets: Ordnung nicht garantiert, duplikatfrei

    // 'to' infix-Operator für das deklarieren eines Pairs
    val map = mapOf('a' to 1, 'b' to 2, 'c' to 3)
    // Java: var map = new HashMap(); map.put('a', 1); map.put('b', 2); ...
    // Map.of in Java anschauen und damit vergleichen statt dem oberen

    // Zugriffe
    val listValue1 = list[0] // in Java: list.get(0);
    val setValue1 = set.elementAt(0) // nicht garantiert, welches Element hier steht!
    val mapValue1 = map['a'] // ähnlich wie in JS

    // Arrays - sind keine Collections; Operationen funktionieren da anders - wurden vorher schon angesprochen
    val array = arrayOf(1, 2, 3, 4) // [1, 2, 3, 4]

    // Mutable Collections
    // Kotlin unterscheidet strikt zwischen mutable und immutable Collections
    // list.add(42) // geht nicht, list ist immutable
    val mutableList = mutableListOf("aa", "bc", "cef")
    mutableList.add("ceg") // ['aa', 'bc', 'cef', 'ceg']

    // Collections zusammenfügen: Operator +
    val list2 = listOf('a', 'b', 'c')
    val listSum = list + list2 // [1, 2, 3, 'a', 'b', 'c'], Type: List<Any>

    // Aggregation - Collection-Operationen
    val sum = list.sum()
    val max = list.maxOrNull()

    // Sortieren
    val sortedList = list.sortedDescending()
    // Sortieren in place - nur bei mutable collections
    mutableList.sortDescending() // ohne 'ed'

    // TODO ergänzen: Listenoperationen sind terminal - bei chains erzeugt jeder Aufruf ein neues Ergebnis -> potentielle Performanceprobleme bei großen Collections

    // Übungen in den einzelnen packages - Übungen und Testklassen herzeigen
}