id = 834688216 
lang = kotlin 
runtime  = 434 ms 
memory = 59.6 MB
title_slug = first-missing-positive
code =

 class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        
        nums.sort()
        
        var currMissing = 1
        
        nums.forEach() { num ->
            if (num <= 0)
                return@forEach
            if (num == currMissing)
                currMissing++
        }
        
        return currMissing
    }
}