id = 689000682 
lang = kotlin 
runtime  = 643 ms 
memory = 63.5 MB
title_slug = move-zeroes
code =

 class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var lastNonZero = 0
        for (i in nums.indices) {
            if (nums[i] != 0) nums[i] = nums[lastNonZero].also { nums[lastNonZero++] = nums[i] }
        }
    }
}