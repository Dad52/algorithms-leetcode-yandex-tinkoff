id = 812718434 
lang = kotlin 
runtime  = 561 ms 
memory = 64.3 MB
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
        
        for (index in lastNonZero until nums.size) {
            nums[index] = 0
        }
        
    }
}