package group.msg.courses.kotlin_course.projects.tictactoe.uebung

class Board {
    val size = 3
    val board = Array(size) { Array(size) { TileState.EMPTY } }

    fun print() {
        println("Spielfeld:")
        for (i in 0 until size) {
            for (j in 0 until size) {
                print(board[i][j])
                if (j < size - 1) print("|")
            }
            println()
            if (i < size - 1) println("-".repeat(size * 2 - 1))
        }
    }

    fun getStateAt(row: Int, col: Int) = board[row][col]

    fun isEmptyAt(row: Int, col: Int) = board[row][col] == TileState.EMPTY

    fun makeMove(row: Int, col: Int, symbol: TileState) {
        board[row][col] = symbol
    }

    fun checkWinForPlayer(player: TileState): Boolean {
        return checkRows(player) || checkColumns(player) || checkDiagonals(player)
    }

    fun isFull(): Boolean =
        board.all { row -> row.none { TileState.EMPTY == it } }

    private fun checkRows(player: TileState): Boolean =
        board.any { row -> row.all { it == player } }

    private fun checkColumns(player: TileState): Boolean {
        for (i in 0 until size) {
            if (board[0][i] == player  && board[1][i] == player && board[2][i] == player) {
                return true
            }
        }
        return false
    }

    private fun checkDiagonals(player: TileState) =
        (board[0][0] == player && board[1][1] == player && board[2][2] == player)
                || (board[0][2] == player && board[1][1] == player && board[2][0] == player)

}