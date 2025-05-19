package group.msg.courses.kotlin_course.collections.tasks.uebungen.uebung04

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Uebung04Test {
    @Test
    fun testReverseList() {
        val input = listOf("banana", "apple", "cherry", "date")
        val expected = listOf("date", "cherry", "apple", "banana")
        assertEquals(expected, Uebung04().reverseList(input))
    }
}