id = 692110690 
lang = kotlin 
runtime  = 400 ms 
memory = 52.9 MB
title_slug = count-negative-numbers-in-a-sorted-matrix
code =

 class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var negativeNums = 0

        grid.forEach { row ->
            negativeNums += row.count { it < 0 }
        }


        return negativeNums
    }
}