package group.msg.courses.kotlin_course.basics.uebung

fun main() {
    val num = 5
    println("$num! = ${calculateFactorial(num)}")
    println("$num! = ${faculty(num)}")
}

fun calculateFactorial(number: Int): Long {
    return when (number) {
        0, 1 -> 1
        else -> {
            var result = 1L
            for (i in 2..number) {
                result *= i
            }

            return result
        }
    }
}

fun faculty(n: Int): Int =
    if (n <= 1) 1 else n * faculty(n - 1)