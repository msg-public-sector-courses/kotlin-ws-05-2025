package group.msg.courses.kotlin_course.lambdas.tasks.loesungen.uebung03

import group.msg.courses.kotlin_course.lambdas.tasks.Customer

class Musterloesung03 {

    fun findHighestPayedAmountInCustomers(customers: List<Customer>): Customer {
        return customers.maxBy { customer ->
            customer.orders.filter { it.isOrdered }
                .sumOf { order ->
                    order.products.sumOf { it.price }
            }
        }
    }
}