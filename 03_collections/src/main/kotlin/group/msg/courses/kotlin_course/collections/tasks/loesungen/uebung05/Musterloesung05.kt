package group.msg.courses.kotlin_course.collections.tasks.uebungen.uebung05

class Musterloesung05 {
    fun removeDuplicates(list: List<Int>): List<Int> {
        return list.toSet().toList()
        // return list.distinct()
    }
}