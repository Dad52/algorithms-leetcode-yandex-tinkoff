id = 907236255 
lang = kotlin 
runtime  = 666 ms 
memory = 64.9 MB
title_slug = monotonic-array
code =

 class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        var dec = true
        var inc = true

        for (i in 1 until nums.size) {
            if (nums[i - 1] > nums[i])
                inc = false
        }

        nums.reverse()

        for (i in 1 until nums.size) {
            if (nums[i - 1] > nums[i])
                dec = false
        }

        return dec || inc
    }
}