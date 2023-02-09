id = 894868741 
lang = kotlin 
runtime  = 305 ms 
memory = 38.9 MB
title_slug = max-consecutive-ones-iii
code =

 class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var zeros = k
        var l = 0
        
        for (r in 0 until nums.size) {
            if (nums[r] == 0) zeros--
            if (zeros < 0) {
                if (nums[l] == 0) zeros++
                l++
            }
        }
        return nums.size - l
    }
}