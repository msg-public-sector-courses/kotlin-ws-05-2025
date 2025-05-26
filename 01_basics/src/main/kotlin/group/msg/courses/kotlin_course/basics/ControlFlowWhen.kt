package group.msg.courses.kotlin_course.basics

fun main() {
    println("Enter weekday as number [1-7]:")
    val weekday = readln().toInt()

    println("Weekday is:")
    println(weekdayAsString1(weekday))
}

private fun weekdayAsString1(weekday: Int): String {
    return when (weekday) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        else -> {
            println("Why are you still working?")
            "Weekend!"
        }
    }
}

private fun weekdayAsString2(weekday: Int) =
    when (weekday) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6, 7 -> "Weekend!"
        else -> "Don´t know what you mean"
    }

private fun weekdayAsString3(weekday: Int) =
    when (weekday) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        in 5..7 -> "Long Weekend!"
        else -> "Don´t know what you mean"
    }