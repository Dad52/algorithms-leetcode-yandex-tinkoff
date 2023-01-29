id = 886930228 
lang = kotlin 
runtime  = 177 ms 
memory = 36.3 MB
title_slug = spiral-matrix
code =

 class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val list = mutableListOf<Int>()

        var rowB = 0
        var rowE = matrix.size - 1
        var colB = 0
        var colE = matrix.first().size - 1

        while (rowB <= rowE && colB <= colE) {
            for (i in colB..colE)
                list.add(matrix[rowB][i])
            rowB++

            for (i in rowB..rowE)
                list.add(matrix[i][colE])
            colE--

            if (rowB <= rowE) {
                for (i in colE downTo colB) 
                    list.add(matrix[rowE][i])
                rowE--
            }

            if (colB <= colE) {
                for (i in rowE downTo rowB)
                    list.add(matrix[i][colB])
                colB++
            }
        }

        return list.toList()
    }
}