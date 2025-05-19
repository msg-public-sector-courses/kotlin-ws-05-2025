package group.msg.courses.kotlin_course.collections.tasks.uebungen.uebung03

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Uebung03Test {
    @Test
    fun testSumList() {
        val input = listOf(1, 2, 3, 4, 5)
        val expected = 15
        assertEquals(expected, Uebung03().sumList(input))
    }
}