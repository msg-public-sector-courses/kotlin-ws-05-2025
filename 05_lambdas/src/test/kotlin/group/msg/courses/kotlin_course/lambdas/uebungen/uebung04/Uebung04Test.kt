package group.msg.courses.kotlin_course.lambdas.uebungen.uebung04

import group.msg.courses.kotlin_course.lambdas.tasks.uebungen.uebung04.Uebung04
import group.msg.courses.kotlin_course.lambdas.uebungen.MockData
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Uebung04Test {

    private val mockData = MockData()
    @Test
    fun `getCustomersSortedByNumberOfOrdersDesc sortiert gegebene Liste korrekt`(){
        // given
        val unsortedList = listOf(mockData.customer1, mockData.customer2, mockData.customer3, mockData.customer4)
        // when
        val sortedList = Uebung04().findCustomersSortedByNumberOfDeliveredOrdersDesc(unsortedList)
        // then
        assertEquals(sortedList.size, 4)
        assertEquals(mockData.customer1, sortedList[0])
        assertEquals(mockData.customer3, sortedList[1])
        assertEquals(mockData.customer2, sortedList[2])
        assertEquals(mockData.customer4, sortedList[3])
    }
}