id = 848596172 
lang = kotlin 
runtime  = 416 ms 
memory = 46.1 MB
title_slug = valid-sudoku
code =

 class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val hashSet = HashSet<String>()
        
        for (i in 0 until 9) {
            for (j in 0 until 9) {
                val num = board[i][j]
                if (num != '.') {
                    if (
                        !hashSet.add(num + " in row " + i) ||
                        !hashSet.add(num + " in column " + j) ||
                        !hashSet.add(num + " in block " + i/3 + "-" + j/3)
                    ) {
                        return false
                    }
                }
            }
        }
        return true
    }
}
