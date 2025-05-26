package group.msg.courses.kotlin_course.null_safety

import group.msg.courses.kotlin_course.null_safety.User.Gender

class SalutationProviderKt {
    fun buildSalutationFor(user: User): String {
        val prefix = when (user.gender) {
            Gender.MALE -> "Guten Tag, Herr"
            Gender.FEMALE -> "Guten Tag, Frau"
            else -> "Hallo,"
        }

        val title = user.title?.plus(" ") ?: ""
        return "$prefix $title${user.firstName} ${user.lastName}"
    }
}
