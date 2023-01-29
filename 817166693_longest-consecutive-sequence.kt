id = 817166693 
lang = kotlin 
runtime  = 694 ms 
memory = 75.9 MB
title_slug = longest-consecutive-sequence
code =

 class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        
        if (nums.size < 2)
            return nums.size
        
        nums.sort()
        
        var max = 1
        var curr = 1
        
        for (i in 0 until nums.size - 1) {
            
            if (nums[i] == nums[i + 1])
                continue
            
            if (nums[i] + 1 == nums[i + 1] )
                curr++
            else 
                curr = 1
            
            max = Math.max(max, curr)
        }
        
        return max
    }
}