id = 789732222 
lang = kotlin 
runtime  = 535 ms 
memory = 53.5 MB
title_slug = find-pivot-index
code =

 class Solution {
    fun pivotIndex(nums: IntArray): Int {

        var leftSum = 0
        val sum = nums.sum()

        nums.forEachIndexed { index, num ->
            if (leftSum == sum - leftSum - num) return index
            leftSum += num
        }

        return -1
    }
}