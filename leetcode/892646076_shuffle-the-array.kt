id = 892646076 
lang = kotlin 
runtime  = 207 ms 
memory = 37.4 MB
title_slug = shuffle-the-array
code =

 class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        
        val result = IntArray(nums.size)
        var left = 0
        
        for (index in 0 until n) {
            result[left] = nums[index]
            result[left + 1] = nums[n + index]
            left += 2
        }
        
        
        return result
    }
}