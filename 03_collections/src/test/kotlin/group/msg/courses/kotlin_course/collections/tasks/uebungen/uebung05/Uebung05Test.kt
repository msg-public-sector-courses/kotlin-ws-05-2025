package group.msg.courses.kotlin_course.collections.tasks.uebungen.uebung05

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Uebung05Test {
    @Test
    fun testRemoveDuplicates() {
        val input = listOf(5, 3, 2, 5, 1, 3, 4, 2)
        val expected = listOf(1, 2, 3, 4, 5)
        val result = Uebung05().removeDuplicates(input)
        assertEquals(5, result.size)
        assertTrue(expected.containsAll(result))
    }
}