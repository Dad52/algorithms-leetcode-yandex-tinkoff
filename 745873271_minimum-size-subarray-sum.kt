id = 745873271 
lang = kotlin 
runtime  = 498 ms 
memory = 64.9 MB
title_slug = minimum-size-subarray-sum
code =

 import kotlin.math.min
class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {

        var minLength = Int.MAX_VALUE
        var windowStart = 0
        var windowSum = 0


        for (windowEnd in nums.indices) {

            windowSum += nums[windowEnd]

            while (windowSum >= target) {
                minLength = min(minLength, windowEnd - windowStart + 1)
                windowSum -= nums[windowStart]
                windowStart++
            }
        }

        return if (minLength == Int.MAX_VALUE) 0 else minLength
    }

}