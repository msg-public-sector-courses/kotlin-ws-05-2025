package group.msg.courses.kotlin_course.lambdas.tasks.loesungen.uebung02

import group.msg.courses.kotlin_course.lambdas.tasks.Customer

class Musterloesung02 {
    fun findCustomersByPostcode(customers: List<Customer>, postCode: String): List<Customer> {
        return customers.filter { it.address.postCode == postCode }.toList()
    }
}
