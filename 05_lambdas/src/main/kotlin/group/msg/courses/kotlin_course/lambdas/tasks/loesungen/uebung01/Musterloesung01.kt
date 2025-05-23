package group.msg.courses.kotlin_course.lambdas.tasks.loesungen.uebung01

import group.msg.courses.kotlin_course.lambdas.tasks.Customer

class Musterloesung01 {
    fun findAllPostCodes(customers: List<Customer>): Collection<String> {
        return customers.map { it.address.postCode }.toSet()
    }
}
