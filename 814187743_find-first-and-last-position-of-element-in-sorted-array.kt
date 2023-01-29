id = 814187743 
lang = kotlin 
runtime  = 344 ms 
memory = 43.3 MB
title_slug = find-first-and-last-position-of-element-in-sorted-array
code =

 class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        
        var left = 0
        var right = nums.size - 1
        
        if (nums.size == 1) {
            if (nums[0] == target)
                return intArrayOf(0, 0)
            else
                return intArrayOf(-1, -1)
        }
            
        
        while (left <= right) {
            if (nums[left] != target) {
                left++
            }
            if (nums[right] != target) {
                right--
            }
            if (nums[right] == target && nums[left] == target) 
                return intArrayOf(left, right)
        }
        
        return intArrayOf(-1, -1)
        
    }
}