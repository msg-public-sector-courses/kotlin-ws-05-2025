package group.msg.courses.kotlin_course.projects.tictactoe.uebung


class TicTacToe {
    private val board = Board()

    fun readInput(): Pair<Int, Int> {
        while (true) {
            print("Gib die Zeilen- und Spaltennummer (getrennt durch ein Leerzeichen) ein (0 bis 2): ")
            val input = readln().split(" ")

            if (input.size != 2) {
                println("Ungültige Eingabe. Bitte gib Zeilen- und Spaltennummer ein.")
            } else {
                val row = input[0].toIntOrNull()
                val col = input[1].toIntOrNull()

                if (row == null || col == null) {
                    println("Ungültige Eingabe. Bitte gib Zeilen- und Spaltennummer im Format 'Zeile Spalte' ein.")
                } else if (!(row in 0 until board.size && col in 0 until board.size)) {
                    println("Ungültige Zeilen- oder Spaltennummer. Bitte wähle Werte im Bereich 1 bis ${board.size}.")
                } else if (!board.isEmptyAt(row, col)) {
                    println("Das Feld ist bereits besetzt. Bitte wähle ein anderes Feld.")
                } else {
                    return Pair(row, col)
                }
            }
        }
    }

    fun play() {
        var currentPlayer = TileState.X
        var gameOver = false

        while (!gameOver) {
            println("Spieler $currentPlayer ist am Zug.")
            val (row, col) = readInput()

            // TODO Hier fehlt die Logik für den Zug des menschlichen Spielers und zum Überprüfen auf Gewinn oder Unentschieden
            // Aktualisiere die Logik entsprechend

            currentPlayer = currentPlayer.switch()
            println("Spieler $currentPlayer ist am Zug.")
            // TODO Hier fehlt die Logik für den Zug des Computers und und zum Überprüfen auf Gewinn oder Unentschieden
            // Aktualisiere die Logik entsprechend

            currentPlayer = currentPlayer.switch()
        }

        println("Spiel vorbei")
    }
}

fun main() {
    println("Willkommen bei Tic Tac Toe!")
    TicTacToe().play()
}