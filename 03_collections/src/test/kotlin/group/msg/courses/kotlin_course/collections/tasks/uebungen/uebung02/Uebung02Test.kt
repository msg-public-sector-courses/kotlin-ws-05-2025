package group.msg.courses.kotlin_course.collections.tasks.uebungen.uebung02

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Uebung02Test {
    @Test
    fun testGetFirstAndLastElement() {
        val input = listOf("apple", "banana", "cherry", "date")
        val expected = Pair("apple", "date")
        assertEquals(expected, Uebung02().getFirstAndLastElement(input))
    }
}