id = 894217916 
lang = kotlin 
runtime  = 178 ms 
memory = 35.7 MB
title_slug = maximum-product-subarray
code =

 class Solution {
    fun maxProduct(nums: IntArray): Int {
        val dp = Array(nums.size) {0}

        var max = nums[0]
        var preMax = max
        var preMin = max

        for (i in 1 until nums.size) {
            if (nums[i] >= 0) {
                preMax = Math.max(nums[i], preMax * nums[i])
                preMin = Math.min(nums[i], preMin * nums[i])
            } else {
                val temp = preMax
                preMax = Math.max(nums[i], preMin * nums[i])
                preMin = Math.min(nums[i], temp * nums[i])
            }

            max = Math.max(max, preMax)
        }

        

        return max
    }
}