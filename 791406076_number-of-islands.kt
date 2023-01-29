id = 791406076 
lang = kotlin 
runtime  = 438 ms 
memory = 59.2 MB
title_slug = number-of-islands
code =

 class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        if (grid.isEmpty()) return 0
        var result = 0

        grid.forEachIndexed { i, it ->
            it.forEachIndexed { j, _ ->
                if (grid[i][j] == '1') {
                    result += dfs(grid, i, j)
                }
            }
        }
        return result
    }

    fun dfs(grid: Array<CharArray>, i: Int, j: Int): Int {
        if (i < 0 || j < 0 || i >= grid.size || j >= grid[0].size || grid[i][j] == '0') {
            return 0
        }
        grid[i][j] = '0'
        dfs(grid, i + 1, j)
        dfs(grid, i - 1, j)
        dfs(grid, i, j - 1)
        dfs(grid, i, j + 1)

        return 1
    }
    }