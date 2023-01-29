id = 838787385 
lang = kotlin 
runtime  = 267 ms 
memory = 37.5 MB
title_slug = rotate-image
code =

 class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        var start = 0
        var end = matrix.lastIndex
        
        while (start <= end) {
            matrix.swap(start++, end--)
        }
        
        for (i in matrix.indices) {
            for (j in i until matrix.size) {
                matrix[i][j] = matrix[j][i].also { matrix[j][i] = matrix[i][j] }
            }
        }
        
    }
    
    fun <T> Array<T>.swap(i: Int, j: Int) {
        if (i == j)
            return
        this[i] = this[j].also { this[j] = this[i] }
    }
}