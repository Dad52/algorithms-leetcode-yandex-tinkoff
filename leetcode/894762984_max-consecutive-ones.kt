id = 894762984 
lang = kotlin 
runtime  = 279 ms 
memory = 38.1 MB
title_slug = max-consecutive-ones
code =

 class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var curr = 0

        nums.forEach() {
            if (it == 1)
                curr++
            else {
                max = Math.max(max, curr)
                curr = 0
            }  
        }

        return Math.max(max, curr)
    }
}