id = 819517451 
lang = kotlin 
runtime  = 442 ms 
memory = 40.1 MB
title_slug = combination-sum
code =

 class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
       
        val resultList = mutableListOf<List<Int>>()
        
        fun backtrack(
            start: Int,
            sum: Int,
            parts: ArrayList<Int>
        ) {
            
            if (sum == target) {
                resultList.add(parts.toList())
                return
            }
            
            for (i in start until candidates.size) {
                if (sum + candidates[i] > target) continue
                parts.add(candidates[i])
                backtrack(i, sum + candidates[i], parts)
                parts.removeAt(parts.size - 1)
            }
            
        }
        
        backtrack(0, 0, arrayListOf())
        return resultList
        
    }
}