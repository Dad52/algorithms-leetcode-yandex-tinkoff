id = 770036045 
lang = kotlin 
runtime  = 388 ms 
memory = 49.9 MB
title_slug = single-number
code =

 class Solution {
    fun singleNumber(nums: IntArray): Int {
        return nums.reduce { acc, next -> acc xor next }
    }
}