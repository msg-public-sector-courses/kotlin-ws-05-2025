package group.msg.courses.kotlin_course.basics

fun main() {
    println(buildShoutMessage("Students", "use Kotlin whenever possible!"))

    println(buildShoutMessage2("Students", "use Kotlin whenever possible"))

    println(buildShoutMessage2("Students", "use Kotlin whenever possible", "!!"))

    println(
        buildShoutMessage3(receiver = "Participants", symbol = "!!")
    )
}

fun buildShoutMessage(receiver: String, message: String): String {
    return receiver + ", " + message.uppercase() + "!"
}

fun buildShoutMessage2(receiver: String, message: String, symbol: String = "!"): String {
    return receiver + ", " + message.uppercase() + symbol
}

fun buildShoutMessage3(
    message: String = "always prefer Kotlin",
    receiver : String,
    symbol: String = "!"
): String {
    return receiver + ", " + message.uppercase() + symbol
}
