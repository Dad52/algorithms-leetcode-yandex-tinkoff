id = 686561482 
lang = kotlin 
runtime  = 432 ms 
memory = 41.5 MB
title_slug = two-sum
code =

 class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        nums.forEachIndexed { index, num ->
        
            if (num + nums[index + 1] == target && index != nums.size - 1) return intArrayOf(index, index + 1)
        
            for (secIndex in index + 1 until nums.size) {
               if (num + nums[secIndex] == target) return intArrayOf(index, secIndex) 
            }
        }
        return intArrayOf(-1, 1)
    }
}