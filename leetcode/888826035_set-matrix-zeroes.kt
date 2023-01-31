id = 888826035 
lang = kotlin 
runtime  = 301 ms 
memory = 40.9 MB
title_slug = set-matrix-zeroes
code =

 class Solution {
    val visited = Int.MAX_VALUE / 2
    fun setZeroes(matrix: Array<IntArray>): Unit {
        for (i in 0 until matrix.size) {
            for (j in 0 until matrix[i].size) {
                if (matrix[i][j] == 0)
                    dfs("all", matrix, i, j)
            }
        }

        for (i in 0 until matrix.size) {
            for (j in 0 until matrix[i].size) {
                if (matrix[i][j] == visited)
                    matrix[i][j] = 0
            }
        }
    }

    fun dfs(dir: String, matrix: Array<IntArray>, i: Int, j: Int) {
        if (i < 0 || j < 0)
            return

        if (i > matrix.lastIndex || j > matrix[0].lastIndex)
            return

        if (matrix[i][j] != 0)
            matrix[i][j] = visited

        if (dir == "all") {
            dfs("left", matrix, i, j - 1)
            dfs("right", matrix, i, j + 1)
            dfs("top", matrix, i - 1, j)
            dfs("bot", matrix, i + 1, j)
        }

        if (dir == "left")
            dfs("left", matrix, i, j - 1)
        else if (dir == "right") 
            dfs("right", matrix, i, j + 1)
        else if (dir == "top") 
            dfs("top", matrix, i - 1, j)
        else if (dir == "bot") 
            dfs("bot", matrix, i + 1, j)
    }
}
