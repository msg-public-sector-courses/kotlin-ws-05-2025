package group.msg.courses.kotlin_course.basics

import kotlin.math.pow

fun main() {
    println("Enter your weight in [kg]:")
    val weight = readln().toInt()

    println("Enter your height in [m]:")
    val height = readln().toFloat()

    println("Your BMI is:")
    val bmi = calculateBmi(weight, height)
    println(bmi)

    println("Your BMI classification:")
    println(determineClassification(bmi))
}

private fun calculateBmi(weight: Int, height: Float) =
    weight / height.pow(2)

private fun determineClassification(bmi: Float) =
    if (bmi < 18.5) {
        "underweight"
    } else if (bmi >= 25) {
        "overweight"
    } else {
        "normal"
    }

