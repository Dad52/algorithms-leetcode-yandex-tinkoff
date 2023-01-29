id = 837395169 
lang = kotlin 
runtime  = 290 ms 
memory = 36.7 MB
title_slug = word-search
code =

 class Solution {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        
        for (i in 0 until board.size) {
            for (j in 0 until board[i].size) {
                if (board[i][j] == word[0]) {
                    val result = dfs(board, i, j, 0, word)
                    if (result)
                        return true
                }
            }
        }
        
        return false
    }
    
    fun dfs(board: Array<CharArray>, i: Int, j: Int, posChar: Int, word: String): Boolean {
        
        var exist = false
        
        if (i < 0 || j < 0 || i > board.lastIndex  || j > board[i].lastIndex || posChar > word.lastIndex) 
            return false
        
        if (word[posChar] != board[i][j])
            return false

        if (word[posChar] == board[i][j] && posChar == word.lastIndex)
            return true

        board[i][j] = board[i][j] + 100
        
        exist = dfs(board, i + 1, j, posChar + 1, word) || 
                dfs(board, i - 1, j, posChar + 1, word) || 
                dfs(board, i, j + 1, posChar + 1, word) || 
                dfs(board, i, j - 1, posChar + 1, word)
        
        board[i][j] = board[i][j] - 100
        
        return exist
    }
    
}