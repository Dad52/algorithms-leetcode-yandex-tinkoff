id = 888872204 
lang = kotlin 
runtime  = 243 ms 
memory = 40 MB
title_slug = surrounded-regions
code =

 class Solution {
    fun solve(board: Array<CharArray>): Unit {
        for (i in 0 until board[0].size) {
            if (board[0][i] == 'O')
                dfs(0, i, board)
        }

        for (i in 0 until board[board.lastIndex].size) {
            if (board[board.lastIndex][i] == 'O')
                dfs(board.lastIndex, i, board)
        }

        for (i in 0 until board.size) {
            if (board[i][0] == 'O')
                dfs(i, 0, board)
        }

        for (i in 0 until board.size) {
            if (board[i][board[0].lastIndex] == 'O')
                dfs(i, board[0].lastIndex, board)
        }

        for (i in 0 until board.size) {
            for (j in 0 until board[i].size) {
                if (board[i][j] == '*')
                    board[i][j] = 'O'
                else if (board[i][j] == 'O')
                    board[i][j] = 'X'
            }
        }
    }

    fun dfs(i: Int, j: Int, board: Array<CharArray>) {

        if (i < 0 || j < 0)
            return
        
        if (i > board.lastIndex || j > board[i].lastIndex)
            return

        if (board[i][j] == 'X' || board[i][j] == '*')
            return
        
        board[i][j] = '*'

        dfs(i - 1, j, board)
        dfs(i + 1, j, board)
        dfs(i, j - 1, board)
        dfs(i, j + 1, board)
    }
}