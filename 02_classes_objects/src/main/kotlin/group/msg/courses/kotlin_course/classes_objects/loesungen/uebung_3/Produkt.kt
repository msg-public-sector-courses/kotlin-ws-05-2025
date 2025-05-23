package group.msg.courses.kotlin_course.classes_objects.loesungen.uebung_3

data class Produkt(val id: Int, val name: String, val preis: Double) {
    companion object Database {
        private val products = mutableListOf<Produkt>()

        fun addProduct(product: Produkt) {
            products.add(product)
        }

        fun printProducts() {
            for (product in products) {
                println(product.name)
            }
        }
    }
}
