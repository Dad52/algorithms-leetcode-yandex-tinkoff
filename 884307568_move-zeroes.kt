id = 884307568 
lang = kotlin 
runtime  = 305 ms 
memory = 38.5 MB
title_slug = move-zeroes
code =

 class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var l = 0

        for (i in 0 until nums.size) {
            if (nums[i] != 0) {
                nums[l++] = nums[i]
            }
        }

        for (i in l until nums.size) {
            nums[i] = 0
        }
    }
}

