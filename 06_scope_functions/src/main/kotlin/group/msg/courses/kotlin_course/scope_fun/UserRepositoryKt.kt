package group.msg.courses.kotlin_course.scope_fun

class UserRepositoryKt {

    fun createHomerSimpson() = User().apply {
        name = "Simpson"
        firstName = "Homer"
        address = Address().apply {
            street = "742, Evergreen Terrace"
            zipCode = "58008"
            city = "Springfield"
        }
    }
}