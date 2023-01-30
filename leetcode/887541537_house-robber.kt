id = 887541537 
lang = kotlin 
runtime  = 190 ms 
memory = 35.3 MB
title_slug = house-robber
code =

 class Solution {
    fun rob(nums: IntArray): Int {
        var rob1 = 0
        var rob2 = 0

        for (i in 0 until nums.size) {
            val temp = rob2 + nums[i]
            rob2 = Math.max(rob1, rob2)
            println("i = $i, temp = $temp, rob1 = $rob1 -> $temp, rob2 = max($rob1, $rob2)")
            rob1 = temp
        }
        return Math.max(rob1, rob2)
    }
}