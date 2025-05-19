package group.msg.courses.kotlin_course.projects.tictactoe.uebung

enum class TileState {
    EMPTY {
        override fun toString(): String {
            return " "
        }
    },
    X {
        override fun toString(): String {
            return "X"
        }
    },
    O {
        override fun toString(): String {
            return "O"
        }
    };

    abstract override fun toString(): String

    fun switch(): TileState = if (this == X) O else X
}