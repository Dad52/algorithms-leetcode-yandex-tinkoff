id = 836898348 
lang = kotlin 
runtime  = 529 ms 
memory = 53.8 MB
title_slug = first-missing-positive
code =

 class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        var i = 0
        
        println(nums.toList())
        
        while (i < nums.size) {
            val index = nums[i] - 1
            if (index in nums.indices && nums[index] != nums[i])
                nums[i] = nums[index].also { nums[index] = nums[i] }
            else
                i++
        }
        println(nums.toList())
        for (i in nums.indices) {
            if (nums[i] != i + 1)
                return i + 1
        }
        
        return nums.size + 1
    }
}