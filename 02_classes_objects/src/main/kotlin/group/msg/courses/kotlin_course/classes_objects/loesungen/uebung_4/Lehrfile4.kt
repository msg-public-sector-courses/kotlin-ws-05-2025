package group.msg.courses.kotlin_course.classes_objects.loesungen.uebung_4

open class Lebewesen{
    open fun geräuschMachen() {
        println("...")
    }
}

class Biene : Lebewesen() {
    override fun geräuschMachen(){
        println("BSSSSSS")
    }
}

class Esel : Lebewesen() {
    override fun geräuschMachen(){
        println("IA IA IA")
    }
}

class Kuh : Lebewesen() {
    override fun geräuschMachen(){
        println("Muuuuhhh")
    }
}

open class Hund : Lebewesen() {
    override fun geräuschMachen(){
        println("Wau Wau")
    }
}

class Dobermann : Hund(){
    override fun geräuschMachen(){
        println("*AGGRESSIV* Wau Wau")
    }
}

fun main(){
    val tiere = arrayOf(Lebewesen(), Biene(), Esel(), Kuh(), Hund(), Dobermann())
    tiere.map { it.geräuschMachen() }
}