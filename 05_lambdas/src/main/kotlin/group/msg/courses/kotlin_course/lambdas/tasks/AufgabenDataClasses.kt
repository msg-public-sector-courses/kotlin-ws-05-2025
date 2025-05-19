package group.msg.courses.kotlin_course.lambdas.tasks

data class Shop(val name: String, val customers: List<Customer>)

data class Customer(val name: String, val address: Address, val email: String?, val orders: List<Order>)

data class Order(val products: List<Product>, val isDelivered: Boolean, val isOrdered: Boolean)

data class Product(val name: String, val price: Double)

data class Address(val streetName: String, val postCode: String) {
    override fun equals(other: Any?): Boolean {
        return if (other is Address) streetName.equals(other.streetName) && postCode.equals(other.postCode) else false
    }
}