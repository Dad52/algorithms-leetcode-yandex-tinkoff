id = 745959771 
lang = kotlin 
runtime  = 939 ms 
memory = 101.1 MB
title_slug = maximum-average-subarray-i
code =

 import kotlin.math.max
class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {

        var currSum = 0
        var largestSum = 0

        for (i in 0 until k) {
            currSum += nums[i]// sum of first K elements
        }

        largestSum = currSum

        for (index in 1..nums.size - k) {
            currSum = currSum - nums[index - 1] + nums[index + k - 1]
            largestSum = max(largestSum, currSum)
        }

        return largestSum / k.toDouble()
    }
}