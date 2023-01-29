id = 806792849 
lang = kotlin 
runtime  = 304 ms 
memory = 40.2 MB
title_slug = move-zeroes
code =

 class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        
        var lastNonZero = 0
        
        for (num in nums) {
            if (num != 0) {
                nums[lastNonZero] = num
                lastNonZero++
            }
        }
        
        for (i in lastNonZero until nums.size) {
            nums[i] = 0
        }
        
    }
}