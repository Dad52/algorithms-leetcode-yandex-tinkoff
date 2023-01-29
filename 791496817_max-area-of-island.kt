id = 791496817 
lang = kotlin 
runtime  = 453 ms 
memory = 50.9 MB
title_slug = max-area-of-island
code =

 import kotlin.math.max
class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {

        var maxArea = 0

        grid.forEachIndexed { i, arr ->
            arr.forEachIndexed { j, num ->
                if (num == 1) {
                    val currArea = dfs(grid, i, j)
                    maxArea = max(maxArea, currArea)
                }
            }
        }

        return maxArea
    }

    fun dfs(grid: Array<IntArray>, i: Int, j: Int): Int {

        if (i < 0 || j < 0 || i >= grid.size || j >= grid[0].size || grid[i][j] == 0) {
            return 0
        }

        grid[i][j] = 0

        return 1 + dfs(grid, i + 1, j) +  dfs(grid, i - 1, j) +  dfs(grid, i, j + 1) +  dfs(grid, i, j - 1)
    }
}