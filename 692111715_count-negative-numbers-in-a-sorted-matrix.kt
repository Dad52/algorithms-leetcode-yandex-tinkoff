id = 692111715 
lang = kotlin 
runtime  = 412 ms 
memory = 47.1 MB
title_slug = count-negative-numbers-in-a-sorted-matrix
code =

 class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        
        var negativeNums = 0

        grid.forEach { row ->
            row.map { if (it < 0 ) negativeNums++ }
        }

        return negativeNums
        
    }
}