package group.msg.courses.kotlin_course.lambdas.uebungen.uebung02

import group.msg.courses.kotlin_course.lambdas.tasks.uebungen.uebung02.Uebung02
import group.msg.courses.kotlin_course.lambdas.uebungen.MockData
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Uebung02Test {
    private val mockData = MockData()
    @Test
    fun `getCustomersByPostcode gibt Customer fuer PLZ zurueck`() {
        // given
        val plz = "00000"
        val customers = listOf(mockData.customer1, mockData.customer2, mockData.customer3, mockData.customer4, mockData.customer5, mockData.customer6)
        // when
        val result = Uebung02().findCustomersByPostcode(customers, plz)
        // then
        assertEquals(result.size, 2)
        assertTrue(result.containsAll(listOf(mockData.customer3, mockData.customer4)))
    }
}