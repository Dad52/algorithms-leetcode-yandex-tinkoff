id = 884423754 
lang = kotlin 
runtime  = 491 ms 
memory = 52.2 MB
title_slug = missing-number
code =

 class Solution {
    fun missingNumber(nums: IntArray): Int {
        val mustBe = (nums.size * (nums.size + 1)) / 2
        val numSum = nums.sum()

        return mustBe - numSum
    }
}