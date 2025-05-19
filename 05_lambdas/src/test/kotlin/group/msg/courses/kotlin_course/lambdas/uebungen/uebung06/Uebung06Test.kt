package group.msg.courses.kotlin_course.lambdas.uebungen.uebung06

import group.msg.courses.kotlin_course.lambdas.tasks.uebungen.uebung06.Uebung06
import group.msg.courses.kotlin_course.lambdas.uebungen.MockData
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Uebung06Test {
    private val mockData = MockData()
    @Test
    fun `getProductsOrderedByAtLeastOneCustomer gibt die richtigen Produkte zurueck`() {
        // given
        val customers = listOf(mockData.customer1, mockData.customer2, mockData.customer3, mockData.customer4, mockData.customer5)
        // when
        val result = Uebung06().findProductsOrderedByAtLeastOneCustomer(customers)
        // then
        assertEquals(11, result.size)
        assertTrue(result.containsAll(listOf(mockData.produkt1, mockData.produkt2, mockData.produkt3, mockData.produkt4, mockData.produkt5, mockData.produkt7, mockData.produkt8, mockData.produkt11, mockData.produkt12,
            mockData.teueresProdukt1, mockData.teueresProdukt2)))
    }
}