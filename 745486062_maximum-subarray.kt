id = 745486062 
lang = kotlin 
runtime  = 942 ms 
memory = 90.5 MB
title_slug = maximum-subarray
code =

 import kotlin.math.max
class Solution {
    fun maxSubArray(nums: IntArray): Int {
        
        var currSum = 0
        var largestSum = nums.first()

        nums.forEach { n ->
            if (currSum < 0)
                currSum = 0
            currSum += n
            largestSum = max(largestSum, currSum)
        }

        return largestSum
        
    }
}