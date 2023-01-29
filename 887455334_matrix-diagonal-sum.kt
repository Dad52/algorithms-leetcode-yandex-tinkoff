id = 887455334 
lang = kotlin 
runtime  = 210 ms 
memory = 42.2 MB
title_slug = matrix-diagonal-sum
code =

 class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        var sum = 0
        for (i in 0 until mat.size) {
            sum += mat[i][i]
            if (mat.size - 1 - i != i)
                sum += mat[i][mat.size - 1 - i]
        }
        return sum
    }
}