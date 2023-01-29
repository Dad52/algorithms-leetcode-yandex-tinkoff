id = 818007293 
lang = kotlin 
runtime  = 914 ms 
memory = 82.8 MB
title_slug = find-the-duplicate-number
code =

 class Solution {
    fun findDuplicate(nums: IntArray): Int {
        
        nums.sort()
        
        for (i in 0 until nums.size - 1) {
            if (nums[i] == nums[i + 1])
                return nums[i]
        }
        
        return -1
        
    }
}