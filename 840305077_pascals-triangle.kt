id = 840305077 
lang = kotlin 
runtime  = 263 ms 
memory = 35.4 MB
title_slug = pascals-triangle
code =

 class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        res.add(listOf(1))
        
        if (numRows == 1)
            return res
        
        for (i in 1 until numRows) {
            val temp = mutableListOf<Int>()
            temp.add(1)
            
            for (j in 1 until i) {
                temp.add(res[i - 1][j - 1] + res[i - 1][j])
            }
            
            temp.add(1)
            
            res.add(temp)
            
        }
        
        return res.toList()
    }
}