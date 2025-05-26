package group.msg.courses.kotlin_course.basics

fun main() {
    val name = "ELASTICSEARCH".lowercase()
    println(name.capitalize())

    val items = arrayOf("January", "March", "February")
    items.swap(1, 2)
    println(items.joinToString())
}

fun String.capitalize() =
    this.toCharArray()[0].uppercase() + this.substring(1)
//  this.first().uppercase() + this.substring(1)

fun <T> Array<T>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}