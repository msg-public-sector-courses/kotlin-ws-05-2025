package group.msg.courses.kotlin_course.collections.tasks.uebungen.uebung06

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Uebung06Test {
    @Test
    fun testAverageScore() {
        val input = mapOf("Alice" to 85, "Bob" to 92, "Charlie" to 78, "David" to 90)
        val expected = (85 + 92 + 78 + 90) / 4.0
        assertEquals(expected, Uebung06().averageScore(input), 0.001)
    }
}