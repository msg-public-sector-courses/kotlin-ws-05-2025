package group.msg.courses.kotlin_course.collections.tasks.uebungen.uebung06

class Musterloesung06 {
    fun averageScore(scores: Map<String, Int>): Double {
        val totalScore = scores.values.sum()
        return if (scores.isNotEmpty()) totalScore.toDouble() / scores.size else 0.0
    }
}