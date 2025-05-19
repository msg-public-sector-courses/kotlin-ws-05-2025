package group.msg.courses.kotlin_course.lambdas.uebungen

import group.msg.courses.kotlin_course.lambdas.tasks.Address
import group.msg.courses.kotlin_course.lambdas.tasks.Customer
import group.msg.courses.kotlin_course.lambdas.tasks.Order
import group.msg.courses.kotlin_course.lambdas.tasks.Product

class MockData {
    val produkt1 = Product("Apfel", 0.79)
    val produkt2 = Product("Banane", 0.99)
    val produkt3 = Product("Milch", 1.39)
    val produkt4 = Product("Hafermilch", 1.49)
    val produkt5 = Product("Eier", 1.89)
    val produkt6 = Product("Brot", 1.15)
    val produkt7 = Product("Buch", 15.00)
    val produkt8 = Product("Gutscheinkarte", 20.00)
    val produkt9 = Product("Hackfleisch 1kg", 9.99)
    val produkt10 = Product("Kaffeebohnen", 18.99)
    val produkt11 = Product("Klopapier", 4.99)
    val produkt12 = Product("Schokolade", 2.49)

    val teueresProdukt1 = Product("Fernseher", 489.99)
    val teueresProdukt2 = Product("Rasenmäher", 1099.99)
    val teueresProdukt3 = Product("RohölBarrel", 70.62)

    val addresse1 = Address("Hinterstraße 1", "94032")
    val addresse2 = Address("Bahnhof", "08015")
    val addresse3 = Address("EwiglangerStrassennamemitZahl 12", "00000")
    val addresse4 = Address("Brunnenplatz 13", "93085")
    val addresse5 = Address("", "93085")


    val order1Customer1 = Order(listOf(produkt1, produkt2, produkt12), false, false)
    val order2Customer1 = Order(listOf(teueresProdukt1), false, true)
    val order3Customer1 = Order(listOf(teueresProdukt2), true, true)
    val order4Customer1 = Order(listOf(produkt3, produkt3, produkt3, produkt3), true, true)
    val order5Customer1 = Order(listOf(produkt11, produkt12, produkt7), true, true)

    val order1Customer2 = Order(listOf(teueresProdukt1, teueresProdukt1), true, true)
    val order2Customer2 = Order(listOf(produkt1, produkt2, produkt3, produkt4), true, true)
    val order3Customer2 = Order(listOf(produkt9, produkt12), false, false)
    val order4Customer2 = Order(listOf(produkt5), false, true)

    val order1Customer3 = Order(listOf(produkt1), true, true)
    val order2Customer3 = Order(listOf(produkt8, produkt8, produkt1), false, true)
    val order3Customer3 = Order(listOf(produkt7), false, true)
    val order4Customer3 = Order(listOf(produkt10, produkt11), false, false)
    val order5Customer3 = Order(listOf(produkt1), false, false)
    val order6Customer3 = Order(listOf(produkt2, produkt3), true, true)

    val order1Customer4 = Order(listOf(produkt1, produkt2), true, true)

    val order1Customer5 = Order(listOf(produkt12, produkt2, teueresProdukt2, teueresProdukt2), false, false)
    val order2Customer5 = Order(listOf(produkt1, produkt12, produkt3), false, false)

    val customer1 = Customer("Toller Name", addresse1, "wellensittichfan@gmail.com", listOf(order1Customer1, order2Customer1, order3Customer1, order4Customer1, order5Customer1))
    val customer2 = Customer("Hans Olo", addresse2, null, listOf(order1Customer2, order2Customer2, order3Customer2, order4Customer2))
    val customer3 = Customer("Marmala Pampelmus", addresse3, "marmala@pampelmus.io", listOf(order1Customer3, order2Customer3, order3Customer3, order4Customer3, order5Customer3, order6Customer3))
    val customer4 = Customer("Humelus Pampelmus", addresse3, null, listOf(order1Customer4))
    val customer5 = Customer("Adalbert Angelbrecht", addresse4, null, listOf(order1Customer5, order2Customer5))
    val customer6 = Customer("Berta Beutelsbrot", addresse5, "diesistkeinevalideemail", emptyList())
}