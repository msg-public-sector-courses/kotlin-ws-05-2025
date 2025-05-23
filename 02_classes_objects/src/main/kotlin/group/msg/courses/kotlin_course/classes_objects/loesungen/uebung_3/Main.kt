package group.msg.courses.kotlin_course.classes_objects.loesungen.uebung_3

fun main() {
    val produkt1 = Produkt(1, "Zahnbuerste", 1.99)
    val produkt2 = Produkt(2, "Seife", 0.99)
    Produkt.addProduct(produkt1)
    Produkt.addProduct(produkt2)

    Produkt.printProducts()
}