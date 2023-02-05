id = 892132123 
lang = kotlin 
runtime  = 2301 ms 
memory = 51.8 MB
title_slug = rotate-array
code =

 class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        repeat(k) {
            var prev = nums[nums.lastIndex]
            for (i in 0 until nums.size) {
                nums[i] = prev.also {prev = nums[i]}
            }
        }
    }
}