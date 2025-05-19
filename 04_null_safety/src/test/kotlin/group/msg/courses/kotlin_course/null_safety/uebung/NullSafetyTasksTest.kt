package group.msg.courses.kotlin_course.null_safety.uebung

import kotlin.reflect.full.declaredMemberProperties
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class NullSafetyTasksTest {
    @Test
    fun testUserProperties() {
        User::class.declaredMemberProperties.map { it.name }.apply {
            assertContains(this, "username")
            assertContains(this, "password")
            assertContains(this, "email")
            assertContains(this, "phoneNumber")
            assertContains(this, "dateOfBirth")
        }
    }

    @Test
    fun testNullableProperties() {
        val map = User::class.declaredMemberProperties.associateWith {
            it.returnType.isMarkedNullable
        }.mapKeys { it.component1().name }.apply {
            assertFalse(this["username"]!!)
            assertFalse(this["password"]!!)
            assertFalse(this["email"]!!)

            assertTrue(this["phoneNumber"]!!)
            assertTrue(this["dateOfBirth"]!!)
        }
    }
}