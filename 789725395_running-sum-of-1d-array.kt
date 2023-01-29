id = 789725395 
lang = kotlin 
runtime  = 397 ms 
memory = 40.1 MB
title_slug = running-sum-of-1d-array
code =

 class Solution {
    fun runningSum(nums: IntArray): IntArray {
        
        val newNums = arrayListOf<Int>(nums.first())
        
        nums.forEachIndexed { index, _ ->
            
            if (index == 0) return@forEachIndexed
            newNums.add(nums[index] + newNums[index - 1])
        
        }

        return newNums.toIntArray()
        
    }
}