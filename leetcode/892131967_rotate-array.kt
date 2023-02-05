id = 892131967 
lang = kotlin 
runtime  = 2157 ms 
memory = 51.7 MB
title_slug = rotate-array
code =

 class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        
        if (nums.size == 1)
            return

        var (l, r) = 0 to 1
        var temp = 0

        repeat(k) {
            var prev = nums[nums.lastIndex]
            for (i in 0 until nums.size) {
                nums[i] = prev.also {prev = nums[i]}
            }
        }
    }
}