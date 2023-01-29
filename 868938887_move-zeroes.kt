id = 868938887 
lang = kotlin 
runtime  = 284 ms 
memory = 38.4 MB
title_slug = move-zeroes
code =

 class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var last = 0

        for (i in 0 until nums.size) {
            if (nums[i] != 0)
                nums[last++] = nums[i]
        }

        for (i in last until nums.size) {
            nums[i] = 0
        }

    }
}