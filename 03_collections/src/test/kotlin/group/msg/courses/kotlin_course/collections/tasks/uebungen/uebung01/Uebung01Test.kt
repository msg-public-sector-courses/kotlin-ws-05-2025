package group.msg.courses.kotlin_course.collections.tasks.uebungen.uebung01

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Uebung01Test {
    @Test
    fun testCreateAndFillList() {
        val expected = listOf(1, 2, 3, 4, 5)
        assertEquals(expected, Uebung01().createAndFillList())
    }
}