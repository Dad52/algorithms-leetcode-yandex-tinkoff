id = 894833605 
lang = kotlin 
runtime  = 319 ms 
memory = 42.8 MB
title_slug = max-consecutive-ones-iii
code =

 class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var kk = k
        var i = 0
        
        for (j in 0 until nums.size) {
            if (nums[j] == 0) kk--
            if (kk < 0 && nums[i++] == 0) kk++
        }
        return nums.lastIndex - i + 1
    }
}

   