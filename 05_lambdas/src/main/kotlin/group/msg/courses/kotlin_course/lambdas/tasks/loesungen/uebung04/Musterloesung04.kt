package group.msg.courses.kotlin_course.lambdas.tasks.loesungen.uebung04

import group.msg.courses.kotlin_course.lambdas.tasks.Customer

class Musterloesung04 {

    fun findCustomersSortedByNumberOfDeliveredOrdersDesc(customers: List<Customer>): List<Customer> {
        return customers.sortedBy { it.orders.count { it.isDelivered } }.reversed()
    }
}