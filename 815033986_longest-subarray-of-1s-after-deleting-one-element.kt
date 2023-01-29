id = 815033986 
lang = kotlin 
runtime  = 534 ms 
memory = 73.7 MB
title_slug = longest-subarray-of-1s-after-deleting-one-element
code =

 import kotlin.math.max

class Solution {
    fun longestSubarray(nums: IntArray): Int {
        
        var start = 0
        var end = 0
        var maxSum = 0
        var zeros = 0
        
        while (end < nums.size) {
            
            if (nums[end] == 0) {
                zeros++
            }
            
            while (zeros > 1) {
                if (nums[start] == 0)
                    zeros--
                start++
            }
            
            maxSum = max(maxSum, end - start)
            end++
        }
        
        return maxSum
        
    }
}