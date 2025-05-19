package group.msg.courses.kotlin_course.lambdas.uebungen.uebung01

import group.msg.courses.kotlin_course.lambdas.tasks.uebungen.uebung01.Uebung01
import group.msg.courses.kotlin_course.lambdas.uebungen.MockData
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Uebung01Test {
    private val mockData = MockData()
    @Test
    fun `getAllPostCodes gibt alle PLZs duplikatfrei zurueck`() {
        // given
        val customers = listOf(mockData.customer1, mockData.customer2, mockData.customer3, mockData.customer4, mockData.customer5, mockData.customer6)
        // when
        val result = Uebung01().findAllPostCodes(customers)
        // then
        assertEquals(result.size, 4)
        assertTrue(result.containsAll(listOf("94032", "08015", "00000", "93085")))
    }
}