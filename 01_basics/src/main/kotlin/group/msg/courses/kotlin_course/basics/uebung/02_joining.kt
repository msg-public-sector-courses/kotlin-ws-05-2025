package group.msg.courses.kotlin_course.basics.uebung

fun String.joining(items: Array<String>): String {
    var result = ""
    for (item in items) {
        if (result.isNotBlank()) {
            result += this
        }

        result += item
    }

    return result
}

fun main() {
    println(" | ".joining(arrayOf("foo", "bar")))
}