package group.msg.courses.kotlin_course.basics

fun main() {
    val waterConsumption = arrayOf(298, 364, 173, 254)
    printValues(waterConsumption)

    printValuesWithIndex(waterConsumption)
    printValuesWithIndexReversed(waterConsumption)
}

private fun printValues(values: Array<Int>) {
    println("Values in array:")
    for (value: Int in values) {
        println(value)
    }
}

private fun printValuesWithIndex(values: Array<Int>) {
    println("Values in array:")
    for (i in 0..values.size - 1) {
        println("$i > ${values[i]}")
    }
}

private fun printValuesWithIndexReversed(values: Array<Int>) {
    println("Values in array (reversed):")
    for (i in values.size - 1 downTo 0 step 1) {
        println("$i > ${values[i]}")
    }
}