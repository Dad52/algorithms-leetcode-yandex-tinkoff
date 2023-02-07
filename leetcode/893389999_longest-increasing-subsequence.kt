id = 893389999 
lang = kotlin 
runtime  = 371 ms 
memory = 38.9 MB
title_slug = longest-increasing-subsequence
code =

 class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        val dp = Array(nums.size) {1}

        for (i in nums.size downTo 0) {
            for (j in i + 1 until nums.size) {
                if (nums[i] < nums[j])
                    dp[i] = Math.max(dp[i], 1 + dp[j])
            }
        }

        return dp.max()!!
    }
}