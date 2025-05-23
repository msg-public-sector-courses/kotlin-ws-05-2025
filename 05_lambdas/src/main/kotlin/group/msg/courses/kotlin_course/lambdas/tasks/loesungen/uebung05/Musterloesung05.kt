package group.msg.courses.kotlin_course.lambdas.tasks.loesungen.uebung05

import group.msg.courses.kotlin_course.lambdas.tasks.Product

class Musterloesung05 {
    fun findTenCheapestProducts(products: List<Product>): List<Product> {
        return products.sortedBy { it.price }.take(10)
    }
}