id = 686561888 
lang = kotlin 
runtime  = 503 ms 
memory = 41 MB
title_slug = two-sum
code =

 class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        nums.forEachIndexed { index, num ->
        
            val nextIndex = index + 1
            
            if (num + nums[nextIndex] == target) return intArrayOf(index, index + 1)
        
            for (secIndex in nextIndex until nums.size) {
               if (num + nums[secIndex] == target) return intArrayOf(index, secIndex) 
            }
        }
        return intArrayOf(-1, 1)
    }
}