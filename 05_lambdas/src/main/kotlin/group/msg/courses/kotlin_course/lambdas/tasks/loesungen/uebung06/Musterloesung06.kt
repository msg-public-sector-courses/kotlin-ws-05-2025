package group.msg.courses.kotlin_course.lambdas.tasks.loesungen.uebung06

import group.msg.courses.kotlin_course.lambdas.tasks.Customer
import group.msg.courses.kotlin_course.lambdas.tasks.Product

class Musterloesung06 {
    fun findProductsOrderedByAtLeastOneCustomer(customers: List<Customer>): List<Product> {
        return customers.flatMap {
            customer -> customer.orders.filter { it.isOrdered }.flatMap { it.products }
        }.distinct()
    }
}