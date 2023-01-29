id = 749545248 
lang = kotlin 
runtime  = 308 ms 
memory = 36.1 MB
title_slug = search-a-2d-matrix
code =

 class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
     
        for (i in 0 until matrix.size) {
            matrix[i].forEach {
                if (it == target)
                    return true
            }
        }
        return false
    }
}