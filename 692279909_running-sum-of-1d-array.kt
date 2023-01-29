id = 692279909 
lang = kotlin 
runtime  = 356 ms 
memory = 41.1 MB
title_slug = running-sum-of-1d-array
code =

 class Solution {
    fun runningSum(nums: IntArray): IntArray {
        
        val newNums = mutableListOf<Int>(nums.first())

        nums.forEachIndexed { index,  num ->
            if (index == 0) return@forEachIndexed
            newNums.add(nums[index] + newNums[index - 1])
        }

        return newNums.toIntArray()
        
    }
}