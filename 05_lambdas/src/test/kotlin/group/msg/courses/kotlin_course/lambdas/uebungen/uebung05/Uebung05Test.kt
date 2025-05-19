package group.msg.courses.kotlin_course.lambdas.uebungen.uebung05

import group.msg.courses.kotlin_course.lambdas.tasks.uebungen.uebung05.Uebung05
import group.msg.courses.kotlin_course.lambdas.uebungen.MockData
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Uebung05Test {

    private val mockData = MockData()

    @Test
    fun `getTenCheapestProducts gibt die 10 guenstigsten Produkte aus`() {
        // given
        val products = listOf(mockData.produkt1, mockData.produkt2, mockData.produkt3, mockData.produkt4, mockData.produkt5, mockData.produkt6, mockData.produkt7, mockData.produkt8, mockData.produkt9, mockData.produkt10, mockData.produkt11, mockData.produkt12,
            mockData.teueresProdukt1, mockData.teueresProdukt2, mockData.teueresProdukt3)
        // when
        val cheapestProducts = Uebung05().findTenCheapestProducts(products)
        // then
        assertEquals(cheapestProducts.size, 10)
        assertTrue(cheapestProducts.containsAll(listOf(mockData.produkt1, mockData.produkt2, mockData.produkt3, mockData.produkt4, mockData.produkt5, mockData.produkt6, mockData.produkt7, mockData.produkt9, mockData.produkt11, mockData.produkt12)))
    }

    @Test
    fun `getTenCheapestProducts gibt alle 5 Produkte aus wenn nur 5 Produkte existieren`() {
        // given
        val products = listOf(mockData.produkt1, mockData.produkt2, mockData.produkt3, mockData.produkt4, mockData.produkt5)
        // when
        val cheapestProducts = Uebung05().findTenCheapestProducts(products)
        // then
        assertEquals(cheapestProducts.size, 5)
        assertTrue(cheapestProducts.containsAll(listOf(mockData.produkt1, mockData.produkt2, mockData.produkt3, mockData.produkt4, mockData.produkt5)))
    }
}