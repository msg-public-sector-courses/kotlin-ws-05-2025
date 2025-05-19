package group.msg.courses.kotlin_course.lambdas.uebungen.uebung03

import group.msg.courses.kotlin_course.lambdas.tasks.uebungen.uebung03.Uebung03
import group.msg.courses.kotlin_course.lambdas.uebungen.MockData
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Uebung03Test {
    private val mockData = MockData()
    @Test
    fun `findHighestPayedAmountInCustomers gibt den richtigen Kunden zurueck`() {
        // given
        val customers = listOf(mockData.customer1, mockData.customer2, mockData.customer3, mockData.customer4, mockData.customer5, mockData.customer6)
        // when
        val result = Uebung03().findHighestPayedAmountInCustomers(customers)
        // then
        assertEquals(mockData.customer1, result)
    }
}