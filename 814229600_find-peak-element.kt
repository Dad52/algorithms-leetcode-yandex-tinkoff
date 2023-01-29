id = 814229600 
lang = kotlin 
runtime  = 288 ms 
memory = 36.9 MB
title_slug = find-peak-element
code =

 class Solution {
    fun findPeakElement(nums: IntArray): Int {
        
        var left = 0
        var right = nums.size - 1
        
        while (left < right) {
            val mid = left + (right - left) / 2
            
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        
        return left
    }
}