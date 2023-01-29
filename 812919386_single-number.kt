id = 812919386 
lang = kotlin 
runtime  = 480 ms 
memory = 49.1 MB
title_slug = single-number
code =

 class Solution {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        nums.forEach { 
            result = result xor it
        }
        return result
    }
}