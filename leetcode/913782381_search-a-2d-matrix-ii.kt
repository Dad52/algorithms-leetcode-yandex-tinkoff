id = 913782381 
lang = kotlin 
runtime  = 272 ms 
memory = 46 MB
title_slug = search-a-2d-matrix-ii
code =

 class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        matrix.forEach() {
            if (it.binarySearch(target) > -1)
                return true
        }

        return false
    }
}